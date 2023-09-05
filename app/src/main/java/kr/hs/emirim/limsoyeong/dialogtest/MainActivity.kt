package kr.hs.emirim.limsoyeong.dialogtest

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnItem:Button
    lateinit var textResult:TextView
    lateinit var imgv:ImageView
    var verrionArray = arrayOf("나연", "정연", "유진");
    var idolImgRes = arrayOf(R.drawable.img1, R.drawable.img2, R.drawable.img3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnItem = findViewById(R.id.btn_item)
        textResult = findViewById(R.id.text_result)
        imgv = findViewById(R.id.imgv)

        btnItem.setOnClickListener {
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 아이돌은?");
            dlg.setIcon(R.drawable.icon)
            dlg.setItems(verrionArray){dialog, index ->
                textResult.text = verrionArray[index]
                imgv.setImageResource(idolImgRes[index])
            }
            dlg.setNegativeButton("닫기", null)
            dlg.show()

        }

    }
}