//package com.example.adapter
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.activity.viewModels
//import androidx.lifecycle.lifecycleScope
//import androidx.navigation.findNavController
//import com.example.adapter.databinding.ActivityLoginBinding
//import com.example.adapter.model.Account
//import com.example.adapter.vm.AccountViewModel
//import com.example.adapter.vm.AccountViewModelFactory
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//
//class LoginActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityLoginBinding
//
//    private val accounts = arrayListOf<Account>()
//    private val viewModel : AccountViewModel by viewModels {
//        AccountViewModelFactory(application)
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        binding = ActivityLoginBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        viewModel.accounts.observe(this) {
//            accounts.clear()
//            accounts.addAll(it)
//        }
//        binding.btnLogin.setOnClickListener {
//            val name = binding.edtUseName.toString()
//            val pass = binding.edtPassword.toString()
//            viewModel.addAccount(Account(userName = name,password = pass))
//
//            val action = LoginActivityDirections.actionLoginActivityToDeXuatFragment()
////            findNavController().navigate(action)
//
//        }
//
//
//    }
//}