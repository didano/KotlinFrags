package kernycnhyi.vlad.kotlinfrags


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_second, container, false)
        v.secNextBtn.setOnClickListener {
            Router(fragmentManager!!).secondNextThird()
        }

        v.secBackBtn.setOnClickListener {
            Router(fragmentManager!!).secondBackFirst()
        }
        return v
    }


}
