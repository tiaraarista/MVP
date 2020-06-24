package com.tiara.mvp.presenter

import com.tiara.mvp.model.Data

class MainPresenter(val data:MainView) {
    fun hitung(angka1:Int, angka2:Int){
        val hasil=angka1.times(angka2)

        val model= Data()
        model.dataHasil=hasil
        data.hasilPresenter(model)
    }
}