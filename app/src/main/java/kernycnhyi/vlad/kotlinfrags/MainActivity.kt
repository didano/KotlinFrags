package kernycnhyi.vlad.kotlinfrags

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    val fragTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
    val firstFragment = FirstFragment()
    val secondFragment = SecondFragment()
    val thirdFragment = ThirdFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragTransaction.add(R.id.fragment_container,firstFragment).commit()
    }

    fun onClick(v: View){
//        when(v.id){
//            firstBtnNext.id -> fragTransaction.replace(R.id.fragment_container,secondFragment).addToBackStack(null)
//            secNextBtn.id -> fragTransaction.replace(R.id.fragment_container,thirdFragment).addToBackStack(null)
//            secBackBtn.id -> fragTransaction.replace(R.id.fragment_container,firstFragment)
//            thirdBtnBack.id -> fragTransaction.replace(R.id.fragment_container,secondFragment)
//        }
//        fragTransaction.commit()
    }

    fun getFragmentTransaction():FragmentTransaction{
        return fragTransaction
    }

    fun firstNextSecond(){
        fragTransaction.replace(R.id.fragment_container,secondFragment).addToBackStack(null)
            .commit()
    }

    fun secondNextThird(){
        fragTransaction.replace(R.id.fragment_container,thirdFragment).addToBackStack(null)
            .commit()
    }

    fun secondBackFirst(){
        fragTransaction.replace(R.id.fragment_container,firstFragment).addToBackStack(null)
            .commit()
    }

    fun thirdBackSecond(){
        fragTransaction.replace(R.id.fragment_container,thirdFragment).addToBackStack(null)
            .commit()
    }
}
