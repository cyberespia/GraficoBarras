package com.mariox.barras

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.utils.ColorTemplate
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val graficaBarras = findViewById<BarChart>(R.id.graficaBarras)

        //Creamos la lista con los valores de entrada
        val entradas: MutableList<BarEntry> = ArrayList()
        entradas.add(BarEntry(0f, 2f))
        entradas.add(BarEntry(1f, 4f))
        entradas.add(BarEntry(2f, 6f))
        entradas.add(BarEntry(3f, 8f))
        entradas.add(BarEntry(4f, 3f))
        entradas.add(BarEntry(5f, 1f))

        //MANDAMOS LOS DATOS PARA CREAR LA GRAFICA
        val datos = BarDataSet(entradas, "GRAFICA BARRAS")
        val data = BarData(datos)

        //PONEMOS COLOR A BARRAS
        datos.setColors(*ColorTemplate.COLORFUL_COLORS)

        //SEPARACION
        data.barWidth = 0.9f

        //asigamaos los datos a la grafica
        graficaBarras?.data = data

        //BARRAS CENTRADAS
        graficaBarras?.setFitBars(true)
        graficaBarras?.invalidate()
    }
}