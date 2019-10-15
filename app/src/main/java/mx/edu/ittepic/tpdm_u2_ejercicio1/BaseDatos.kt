package mx.edu.ittepic.tpdm_u2_ejercicio1

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BaseDatos(
    context: Context?,
    name: String?,
    factory: SQLiteDatabase.CursorFactory?,
    version: Int
) : SQLiteOpenHelper(context, name, factory, version) {

    override fun onCreate(db: SQLiteDatabase?) {
        //SE EJECUTA UNICA Y EXCLUSIVAMENTE LA PRIMERA VEZ LA APP SE EJECUTA EN EL CELL
        db?.execSQL("CREATE TABLE PERSONA(ID INTEGER,NOMBRE VARCHAR(200),DOMICILIO VARCHAR(200))")
        //CONSTRUIR LOS OBEJRTOS
        //INVOCAR POR ID
        //INVOCAR LLOS EVENTOS

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        //SE EJECUTA SI  SOLO SI, LA VERSION DE LA BD DE SQLite Y LA
        // VERSION DE LA BD DE LA APP (TRAS UNA ACTUALIZACION) SON DIFERENTES
    }

}