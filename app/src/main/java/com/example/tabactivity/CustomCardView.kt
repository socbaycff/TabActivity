package com.example.tabactivity

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import com.google.android.material.card.MaterialCardView

class CustomCardView(context: Context, attributeSet: AttributeSet) : MaterialCardView(context,attributeSet) {
    val paint = Paint().apply {
        strokeColor = color
    }
    var radiusM = getRadius()
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        // vẽ hình chữ nhật với color là background, chiều ngang bằng card, chiều cao bằng radius, vẽ từ bottom lên để che phần lõm
        canvas?.drawRect(left.toFloat(),bottom+ radiusM,right.toFloat(),bottom.toFloat(),paint)
    }
}