package com.example.projectmanager.Activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectmanager.Adapter.ArchivesAdapter
import com.example.projectmanager.Adapter.MyTeamAdapter
import com.example.projectmanager.ViewModel.ProfileViewModel
import com.example.projectmanager.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    lateinit var binding: ActivityProfileBinding
    val  profileViewModel:ProfileViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val myTeamAdapter by lazy {
                MyTeamAdapter(profileViewModel.loadDataMyTeam())
            }

            viewTeam.apply {
                adapter =myTeamAdapter
                layoutManager= LinearLayoutManager(
                    this@ProfileActivity,LinearLayoutManager.VERTICAL,false
                )

            }
            val archivesAdapter by lazy { ArchivesAdapter(profileViewModel.loadDataArchive())}
            viewArchive.apply {
                adapter = archivesAdapter
                layoutManager= LinearLayoutManager(this@ProfileActivity,LinearLayoutManager.HORIZONTAL,false)
            }
        }





    }
}