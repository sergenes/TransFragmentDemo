package nes.com.transfragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.nes.transfragment.BaseTransFragment
import kotlinx.android.synthetic.main.fragment_third.*

/**
 * Created by sergenes on 10/10/17.
 */
class ThirdFragment : BaseTransFragment() {

    override fun onCreateAnimation(transit: Int, enter: Boolean, nextAnim: Int): Animation {

        val anim = AnimationUtils.loadAnimation(activity, nextAnim)

        anim.setAnimationListener(object : Animation.AnimationListener {

            override fun onAnimationStart(animation: Animation) {
                Log.d(TAG, "Animation started.")
                // additional functionality
            }

            override fun onAnimationRepeat(animation: Animation) {
                Log.d(TAG, "Animation repeating.")
                // additional functionality
            }

            override fun onAnimationEnd(animation: Animation) {
                Log.d(TAG, "Animation ended.")

            }
        })

        return anim
    }

    override fun getFragmentContainer(): Int {
        return R.id.fragmentContainer
    }

    override fun getBackFragmentClass(): Class<*> {
        return SecondFragment::class.java
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var view: View? = inflater!!.inflate(R.layout.fragment_third, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nextButton.setOnClickListener {
            performBack()
        }

        openButton.setOnClickListener {
            forwardToFragment(OpenFragment())
        }


    }
}