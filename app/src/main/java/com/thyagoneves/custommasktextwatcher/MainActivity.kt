package com.thyagoneves.custommasktextwatcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thyagoneves.custom_mask_textwatcher.CustomMask
import com.thyagoneves.custommasktextwatcher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.textInputLayoutPhone.addTextChangedListener(CustomMask.mask("(##) #####-####", binding.textInputLayoutPhone, binding.myTextView))

        binding.textInputLayoutCNPJ.addTextChangedListener(CustomMask.mask("##.###.###/####-##", binding.textInputLayoutCNPJ, binding.myTextView))

        binding.textInputLayoutCPF.addTextChangedListener(CustomMask.mask("###.###.###-##", binding.textInputLayoutCPF, binding.myTextView))

        binding.textInputLayoutDate.addTextChangedListener(CustomMask.mask("##-##-####", binding.textInputLayoutDate, binding.myTextView))

        binding.textInputLayoutPlate.addTextChangedListener(CustomMask.mask("###-####", binding.textInputLayoutPlate, binding.myTextView))

        //Pegar texto sem formatação, sem a máscara | getting unmasked text:
        val unMaskedText = CustomMask.unMask(binding.textInputLayoutPhone.text.toString())
    }
}