package vn.edu.greenwich.m_expense.database;

public class TripEntry {
    public static final String TABLE_NAME = "trip";
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_DESTINATION = "destination";
    public static final String COL_INITIATION_DATE = "start_date";
    public static final String COL_FINALE_DATE = "end_date";
    public static final String COL_RISK = "risk";
    public static final String COL_DESCRIPTION = "description";

    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
                    COL_ID + " INTEGER PRIMARY KEY," +
                    COL_NAME + " TEXT NOT NULL," +
                    COL_DESTINATION + " TEXT NOT NULL," +
                    COL_INITIATION_DATE + " TEXT NOT NULL," +
                    COL_FINALE_DATE + " TEXT NOT NULL," +
                    COL_RISK + " INTEGER NOT NULL," +
                    COL_DESCRIPTION + " TEXT)";

    public static final String SQL_DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
}