package com.example.football4.view

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.football4.MAIN
import com.example.football4.R
import kotlinx.android.synthetic.main.fragment_start.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        id_start_progress.max = 2000
        val finishProgress = 2000

        ObjectAnimator.ofInt(id_start_progress,"progress",finishProgress)
            .setDuration(6000)
            .start()

        CoroutineScope(Dispatchers.Main).launch {
            delay(6000)
            MAIN.navController.navigate(R.id.action_startFragment_to_countryFragment)
        }

    }

}