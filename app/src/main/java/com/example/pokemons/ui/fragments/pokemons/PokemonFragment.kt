package com.example.pokemons.ui.fragments.pokemons

import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.pokemons.R
import com.example.pokemons.base.BaseFragment
import com.example.pokemons.databinding.FragmentPokemonsBinding
import com.example.pokemons.models.PokemonResponse
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class PokemonFragment : BaseFragment<FragmentPokemonsBinding, PokemonViewModel>(
    R.layout.fragment_pokemons
), AdapterView.OnItemSelectedListener {
    override val binding by viewBinding(FragmentPokemonsBinding::bind)
    override val viewModel: PokemonViewModel by sharedViewModel()
    private var detailId = 0

    override fun initialize() {
        viewModel.response.observe(viewLifecycleOwner, {
            setupSpinner(it)
        })
    }

    override fun setupViews() {
        binding.pokemonSpinner.onItemSelectedListener = this
    }

    private fun setupSpinner(pokemonResponse: PokemonResponse) {
        val camOptions = arrayOfNulls<String>(pokemonResponse.results.size)
        for (i in pokemonResponse.results.indices) {
            camOptions[i] = pokemonResponse.results[i].name
        }
        ArrayAdapter<String>(
            requireContext(),
            android.R.layout.simple_spinner_item, camOptions
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.pokemonSpinner.adapter = adapter
        }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        detailId = position + 1
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    override fun setupListeners() {
        clickDetailOpen()
    }

    private fun clickDetailOpen() {
        binding.btnDetail.setOnClickListener {
            findNavController().navigate(
                PokemonFragmentDirections.actionPokemonFragmentToDetailFragment(
                    detailId
                )
            )
        }
    }
}