package com.justaproject.qdamos.ui.crear

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CrearViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Es el fragment de crear activitat"
    }
    val text: LiveData<String> = _text
}