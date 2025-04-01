package ru.fav.coroutines

import android.os.Bundle
import ru.fav.coroutines.base.BaseActivity
import ru.fav.coroutines.base.NavigationAction
import ru.fav.coroutines.databinding.ActivityMainBinding
import ru.fav.coroutines.fragment.MainFragment

class MainActivity : BaseActivity(){
    override val mainContainerId = R.id.main_fragment_container

    private var viewBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding?.root)

        navigate(
            destination = MainFragment(),
            destinationTag = MainFragment.MAIN_FRAGMENT_TAG,
            action = NavigationAction.ADD,
            isAddToBackStack = false
        )
    }

    override fun onDestroy() {
        viewBinding = null
        super.onDestroy()
    }
}

