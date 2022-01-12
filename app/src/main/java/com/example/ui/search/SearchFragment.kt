package com.example.ui.search

import androidx.fragment.app.viewModels
import com.example.base.BaseFragment
import com.example.baseactivity.R
import com.example.baseactivity.databinding.FragmentSearchBinding


class SearchFragment : BaseFragment<FragmentSearchBinding, SearchViewModel>() {

    override val viewModel: SearchViewModel by viewModels()
    override val layoutID: Int = R.layout.fragment_search

    companion object {

        fun constrain(): SearchFragment {
            return SearchFragment()
        }
    }


}