package kernycnhyi.vlad.kotlinfrags


import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val v = inflater.inflate(R.layout.fragment_first, container, false)

        v.firstBtnNext.setOnClickListener {
            Router(fragmentManager!!).firstNextSecond()
        }

        val textWatcher = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
//
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s.toString().isNotEmpty()) {
                    (activity as MainActivity).supportActionBar?.title = s?.take(before + 1)
                }
            }
        }
        v.changeTitleEditText.addTextChangedListener(textWatcher)

        v.applyBtn.setOnClickListener {
            (activity as MainActivity).supportActionBar?.title =
                v.changeTitleEditText.text.toString()
            val inputMethodManager =
                activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(
                activity?.currentFocus?.windowToken,
                0
            )
            v.changeTitleEditText.text.clear()
            v.changeTitleEditText.clearFocus()
        }


        return v
    }

}
