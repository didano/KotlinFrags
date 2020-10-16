package kernycnhyi.vlad.kotlinfrags

import androidx.fragment.app.FragmentManager

class Router(private val fragmentManager: FragmentManager) {

    fun firstNextSecond() {
        fragmentManager.beginTransaction().replace(R.id.fragment_container, SecondFragment())
            .addToBackStack(null)
            .commit()
    }

    fun secondNextThird() {
        fragmentManager.beginTransaction().replace(R.id.fragment_container, ThirdFragment())
            .addToBackStack(null)
            .commit()
    }

    fun secondBackFirst() {
        fragmentManager.popBackStack()
    }

    fun thirdBackSecond() {
        fragmentManager.popBackStack()
    }
}