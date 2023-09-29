package com.alvarengadev.notesapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alvarengadev.notesapp.ui.theme.BabyBlue
import com.alvarengadev.notesapp.ui.theme.LightGreen
import com.alvarengadev.notesapp.ui.theme.RedOrange
import com.alvarengadev.notesapp.ui.theme.RedPink
import com.alvarengadev.notesapp.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null,
) {
    companion object {
        val noteColors = listOf(RedOrange, RedPink, BabyBlue, Violet, LightGreen)
    }
}

class InvalidNoteException(message: String): Exception(message)
