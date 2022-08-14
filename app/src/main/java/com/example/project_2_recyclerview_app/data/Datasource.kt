package com.example.project_2_recyclerview_app.data

import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Athkari

class Datasource {
    fun loadAthkari() : List<Athkari>{
        return listOf(
            Athkari(R.string.morning_athkar, R.drawable.sunrise),
            Athkari(R.string.evening_athkar, R.drawable.night_mode),
            Athkari(R.string.sleep_athkar, R.drawable.sleeping),
            Athkari(R.string.waking_up_athkar, R.drawable.alarm),
            Athkari(R.string.mosque_athkar, R.drawable.mosque),
            Athkari(R.string.prayers_athkar, R.drawable.praying)
        )
    }
}