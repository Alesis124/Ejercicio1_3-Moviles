package dam.moviles.ejercicio1_3
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import dam.moviles.ejercicio1_3.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var controles:ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        inicializarViewModel()
        inicializarMochila()

        setColor(viewModel.getColorRandom());

    }


    private fun setColor(lohColore: Int) {

        val colorName: String = viewModel.colores[lohColore]
        controles.colorText.text = "Este texto está escrito en color "+ colorName
        when (colorName) {
            "Rojo" -> controles.colorText.setTextColor(Color.RED)
            "Amarillo" -> controles.colorText.setTextColor(Color.YELLOW)
            "Verde" -> controles.colorText.setTextColor(Color.GREEN)
            "Azul" -> controles.colorText.setTextColor(Color.BLUE)
            "Negro" -> controles.colorText.setTextColor(Color.BLACK)
            "Naranja" -> controles.colorText.setTextColor(Color.parseColor("#FFA500")) // Color Naranja no existe, entoces lo ponemos con parseColor
        }
    }

    private fun inicializarViewModel(){
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
    }

    private fun inicializarMochila() {
        controles = ActivityMainBinding.inflate(layoutInflater)
        setContentView(controles.root)

    }


}
