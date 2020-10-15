package kernycnhyi.vlad.kotlinfrags


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_second.view.*

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_second, container, false)
        v.secNextBtn.setOnClickListener { MainActivity().secondNextThird() }

        v.secBackBtn.setOnClickListener { MainActivity().secondBackFirst() }
        return v
    }


}
