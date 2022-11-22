package com.example.calcintentweb

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class IntentActivity : AppCompatActivity() {

    lateinit var Buttonsms:Button
    lateinit var Buttoncamera:Button
    lateinit var Buttonshare:Button
    lateinit var Buttoncall:Button
    lateinit var Buttonstk:Button
    lateinit var Buttonemail:Button
    lateinit var Buttondail:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        Buttonsms=findViewById(R.id.Btn_sms)
        Buttondail=findViewById(R.id.Btn_dail)
        Buttonemail=findViewById(R.id.Btn_email)
        Buttonstk=findViewById(R.id.Btn_mpesa)
        Buttoncall=findViewById(R.id.Btn_call)
        Buttonshare=findViewById(R.id.Btn_share)
        Buttoncamera=findViewById(R.id.Btn_camera)


        Buttonsms.setOnClickListener {
            val uri= Uri.parse("smsto:0703223573")

            val intent=Intent(Intent.ACTION_SENDTO,uri)

            intent.putExtra("Hello", "How is todays weather")

            startActivity(intent)
        }
        Buttoncamera.setOnClickListener {
           val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent,1)
        }
        Buttoncall.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254721633135"))

            if (ContextCompat.checkSelfPermission(
                    this@IntentActivity,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@IntentActivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }
        }

        Buttonshare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            startActivity(shareIntent)
        }

        Buttonstk.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }

        }
        Buttondail.setOnClickListener {
            val phone = "0703223573"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)
        }
        Buttonemail.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
    }
}