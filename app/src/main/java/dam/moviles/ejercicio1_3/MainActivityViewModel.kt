package dam.moviles.ejercicio1_3
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainActivityViewModel : ViewModel() {

    //Nos traemos las variables del MainActivity (siendo publicas) para poder utilizarlas en el MainActivity

    var colores:List<String> = listOf("Rojo", "Amarillo", "Verde", "Azul", "Negro", "Naranja")
    var nColorRandom:Int = 0
    var enter:Boolean = false


    fun getColorRandom(): Int {

        if (!enter) {
            nColorRandom = Random.nextInt(colores.size)
            enter=true
        }


        return nColorRandom
    }
}
