/*
 * Copyright (c) 2019 Hemanth Savarala.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by
 *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */
package code.name.monkey.retromusic.views

import android.content.Context
import android.util.AttributeSet
import android.view.View

class StatusBarView(
    context: Context,
    attrs: AttributeSet
) : View(context, attrs) {

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        if (isInEditMode) {
            return
        }
        setOnApplyWindowInsetsListener { _, insets ->
            val height = insets?.systemWindowInsetTop ?: 0
            setHeight(height)
            insets
        }
    }

    private fun setHeight(px: Int) {
        val params = layoutParams ?: return
        params.height = px
        layoutParams = params
    }
}