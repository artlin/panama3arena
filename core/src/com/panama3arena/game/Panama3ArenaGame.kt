package com.panama3arena.game

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.ScreenUtils

class Panama3ArenaGame : ApplicationAdapter() {
    var batch: SpriteBatch? = null
    var img: Texture? = null
    override fun create() {
        batch = SpriteBatch()
        img = Texture("badlogic.jpg")
    }

    override fun render() {
        ScreenUtils.clear(1f, 0f, 0f, 1f)
        batch?.let {
            it.begin()
            it.draw(img, 0f, 0f)
            it.end()
        }
    }

    override fun dispose() {
        batch?.dispose()
        img?.dispose()
    }
}