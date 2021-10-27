package br.com.emersonfiwre.tikplayer

import androidx.fragment.app.FragmentManager
import br.com.emersonfiwre.tikplayer.view.fragment.TikPlayerFragment

object TikPlayerInitialize {
    private var fragmentManager: FragmentManager? = null
    private var containerId: Int? = null

    fun withFragment(manager: FragmentManager, container: Int): TikPlayerInitialize {
        fragmentManager = manager
        containerId = container
        return this
    }

    fun build() {
        containerId?.let { containerId->
            fragmentManager?.beginTransaction()
                ?.replace(
                    containerId,
                    TikPlayerFragment.newInstance(),
                    TikPlayerFragment::class.java.name
                )
                ?.commit()
        }
    }
}