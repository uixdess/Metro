package code.name.monkey.retromusic.room.playlist

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import code.name.monkey.retromusic.room.SongEntity

@Entity(tableName = "playlist_entity")
data class PlaylistEntity(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val playlistId: Int,
    @ColumnInfo(name = "playlist_name") val playlistName: String?,
    @Embedded val songs: List<SongEntity>?
)