package com.example.calulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var n1=0 ; var n2=0
        fun SetNum () {
         n1=txtnum1.text.toString().toInt()
         n2=txtnum2.text.toString().toInt()
        }
         btnAdd6.setOnClickListener() {SetNum();textView4.text =(n1+n2).toString()}
         btnsub.setOnClickListener() {SetNum();textView4.text =(n1-n2).toString()}
         btnmult.setOnClickListener() {SetNum();textView4.text =(n1*n2).toString()}
         btndiv.setOnClickListener() {SetNum();textView4.text =(n1/n2).toString()}

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

}