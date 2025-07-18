package eu.tutorials.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel(){
    private val _count = mutableStateOf(0)
    //exposing count as immutable state
    val count: MutableState<Int> = _count
    fun increment(){
        _count.value++
    }

    fun decrement(){
        _count.value--
    }
}