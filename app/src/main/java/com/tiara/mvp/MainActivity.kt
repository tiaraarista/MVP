package com.tiara.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tiara.mvp.model.Data
import com.tiara.mvp.presenter.MainPresenter
import com.tiara.mvp.presenter.MainView

class MainActivity : AppCompatActivity(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //inisialisasi angkanya
        val angka1=30
        val angka2=40

        //manggil presenter
        val presenter = MainPresenter(this)
        //manggil fungsi dipresenter
        presenter.hitung(angka1,angka2)
    }
    override fun hasilPresenter(data: Data){
        //Tampilkan Hasilnya
        Log.d("hasilnya: ", data.dataHasil.toString())
    }
}
