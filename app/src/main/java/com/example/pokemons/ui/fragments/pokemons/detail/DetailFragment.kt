package com.example.pokemons.ui.fragments.pokemons.detail

import android.net.Uri
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.pokemons.R
import com.example.pokemons.base.BaseFragment
import com.example.pokemons.databinding.FragmentDetailBinding
import com.example.pokemons.ui.fragments.pokemons.PokemonViewModel
import com.example.pokemons.utils.isCapitalizing
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou


class DetailFragment : BaseFragment<FragmentDetailBinding, PokemonViewModel>(
    R.layout.fragment_detail
) {
    override val binding by viewBinding(FragmentDetailBinding::bind)
    override val viewModel: PokemonViewModel by activityViewModels()
    private val args: DetailFragmentArgs by navArgs()

    override fun setupRequests() {
        viewModel.fetchIdPokemon(args.id).observe(viewLifecycleOwner, {
            binding.apply {
                GlideToVectorYou
                    .init()
                    .with(requireContext())
                    .load(Uri.parse(it.sprites.other.dream_world.front_default), detailImagePokemon)
                detailTxtName.text = isCapitalizing(it.name)
                detailTxtType.text = isCapitalizing(it.types?.get(0)?.type?.name.toString())
            }
        })
    }
}