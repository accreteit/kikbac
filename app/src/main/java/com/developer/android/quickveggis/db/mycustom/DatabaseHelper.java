package com.developer.android.quickveggis.db.mycustom;

import java.io.IOException;
import java.sql.SQLException;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.developer.android.quickveggis.model.NotificationModel;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {
	
	private static final String DATABASE_NAME = "mydb.db";
	private static final int DATABASE_VERSION = 1;
	
	private Dao<NotificationModel, String> userDao = null;
	
	
	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		
		DatabaseInitializer initializer = new DatabaseInitializer(context);
		try {
			initializer.createDatabase();
			initializer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	
	@Override
	public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
		try {
			Log.i(DatabaseHelper.class.getName(), "onCreate");
			
			TableUtils.createTable(connectionSource, NotificationModel.class);
			
		} catch (SQLException e) {
			Log.e(DatabaseHelper.class.getName(), "Can't create database", e);
			throw new RuntimeException(e);
		}
	}

	
	@Override
	public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int oldVersion, int newVersion) {
		try {
			Log.i(DatabaseHelper.class.getName(), "onUpgrade");
			
			TableUtils.dropTable(connectionSource, NotificationModel.class, true);
			
			onCreate(db);
		} catch (SQLException e) {
			Log.e(DatabaseHelper.class.getName(), "Can't drop databases", e);
			throw new RuntimeException(e);
		}
	}

	
	public Dao<NotificationModel, String> getUserDao() throws SQLException {
		if (userDao == null) {
//			userDao = BaseDaoImpl.createDao(getConnectionSource(), Notification.class);
			userDao = getDao(NotificationModel.class);
		}
		return userDao;
	}
	
	
	
	@Override
	public void close() {
		super.close();
		userDao = null;
	}
}
