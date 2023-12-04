package com.example.demo.repositorio;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.modelo.RFC1;
import com.example.demo.modelo.RFC2;
import com.example.demo.modelo.habitaciones;
import com.example.demo.modelo.mostarHabis;
import com.example.demo.modelo.mostrarConsumos;
import com.example.demo.modelo.mostrarServ;
import com.example.demo.modelo.mostrarTipoHabi;
import com.example.demo.modelo.reservas;
import com.example.demo.modelo.servicio;
import com.example.demo.modelo.tipohabi;

import java.util.List;

public interface reservaRepository extends MongoRepository<reservas, ObjectId> {

    @Query("{}")
    List<reservas> findAllReservas();


   @Aggregation(pipeline = {
        "{ $group: {_id: \"$habitaciones.tipohabi.nombre\", tipohabi: { $first: \"$habitaciones.tipohabi\" }}}",
        "{ $replaceWith: { tipohabi : { $arrayElemAt: [\"$tipohabi\", 0] }}}",
    })
    List<mostrarTipoHabi> getTipohabis();


    @Aggregation(pipeline = {
        "{$group: {_id: \"$habitaciones.numero\", habitaciones: { $first: \"$habitaciones\" }}}",
        "{$replaceWith: { habitaciones: { $arrayElemAt: [\"$habitaciones\", 0] } }}"
    })
    List<mostarHabis> getHabis();



    @Aggregation(pipeline = {
        "{$unwind: \"$consumos\"}",
        "{$unwind: \"$consumos.servicio\"}",
        "{$group: { _id: \"$consumos.servicio.nombre\", descripcion: { $first: \"$consumos.servicio.descripcion\" }, costo: { $first: \"$consumos.servicio.costo\" }, totalConsumos: { $sum: 1 } }}"
    })
    List<mostrarServ> obtenerInformacionServicios();
    
    
    //RF1
    //BUSQUEDA

    public class rf1 {
        String nombre;
        int habitaciones;

        public rf1(String nombre, int habitaciones) {
            this.nombre = nombre;
            this.habitaciones = habitaciones;
        }

        public String getNombre() {
            return nombre;
        }

        public int getHabitaciones() {
            return habitaciones;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setHabitaciones(int habitaciones) {
            this.habitaciones = habitaciones;
        }
    }

    @Aggregation(pipeline = {"{$group:{_id: \"$habitaciones.tipohabi.nombre\", habitaciones: {$sum: 1}}}"})
    List<rf1> obtenerCantidadTiposhabis();
    
    //UPDATE
    
    //INSERT*
        
    //DELETE*

    //consumos
     @Aggregation(pipeline = {"{ $unwind: {path: \"$consumos\" }}"})
    List<mostrarConsumos> obtenerConsumos();
    
    //RFC1
    @Aggregation(pipeline = {
        "{$unwind: \"$consumos\"}",
        "{$group: {_id: \"$habitaciones.numero\", totalDineroRecolectado: { $sum: \"$consumos.servicio.costo\" }}}",
    })
    List<RFC1> obtenerRFC1();

    //RFC2
    @Aggregation(pipeline = {
        "{$match: {inicio: { $gte: new Date(\"2022-12-01\"), $lt: new Date(\"2023-12-31\") }}} {$unwind: \"$habitaciones\"}",
        "{$group: {_id: \"$habitaciones.numero\", totalDiasOcupados: { $sum: { $divide: [ { $subtract: [\"$fin\", \"$inicio\"] }, 24 * 60 * 60 * 1000 ] } } }}",
        "{$project: {habitacionNumero: \"$_id\", indiceDeOcupacion: { $round: [ { $multiply: [ { $divide: [\"$totalDiasOcupados\", 365] }, 100 ] }, 2 ] }, _id: 0}}",
    })
    List<RFC2> obtenerRFC2();
    
    
    
}
