package by.savushkin.study.geekbrains.kinopoisk_films

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        outFromCycle()
    }

    private fun outFromCycle() {
        val list = ArrayList<Int>()
        for (i in 1..10) {
            list.add(i)
            Log.d("OUT", "for (i in 1..10) = $i")
        }

        for (i in 1..10 step 2)
            Log.d("OUT", "for(i in 1..10 step 2) = $i")

        for (item in list)
            Log.d("OUT", "for(item in list) = $item")
    }

    private fun initView() {
        findViewById<Button>(R.id.but_click).setOnClickListener {
            val text = getDataFromObject()
            findViewById<TextView>(R.id.tv_default).text = text
        }
    }

    private fun getDataFromObject(): String {
        val object1 = LessonFirstClass(id = 1, name = "........")
        val object2 = object1.copy()

        return object2.toString()
    }
}