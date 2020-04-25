package code.name.monkey.retromusic.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [SongEntity::class], version = 2, exportSchema = false)
abstract class QueueStoreDatabase : RoomDatabase() {

    abstract fun queueDao(): QueueDao

    companion object {
        @Volatile
        private var INSTANCE: QueueStoreDatabase? = null

        fun getMusicDatabase(context: Context): QueueStoreDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    QueueStoreDatabase::class.java,
                    "music_playback_state"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
                return instance
            }
        }
    }
} 