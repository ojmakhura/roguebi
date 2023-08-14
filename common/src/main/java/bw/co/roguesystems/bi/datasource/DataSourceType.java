package bw.co.roguesystems.bi.datasource;

public enum DataSourceType {

    // private final String enumValue;

    /**
     * The constructor with enumeration literal value allowing
     * super classes to access it.
     */
    // private DataSourceType(String value)
    // {
    //     this.enumValue = value;
    // }
    
    REST_API_ENDPOINT,
    SOAP_API_ENDPOINT,
    DB_URL

    // public String value()
    // {
    //     return this.enumValue;
    // }

//     public static DataSourceType fromValue(String value)
//     {
//         // Allow either the Enum name or value string to be used to retrieve the enum
//         for (DataSourceType enumName: DataSourceType.values())
//         {
//             if (enumName.getValue().equals(value))
//             {
//                 return enumName;
//             }
//         }
//         for (String enumName: DataSourceType.names())
//         {
//             if (enumName.equals(value))
//             {
//                 return DataSourceType.valueOf(enumName);
//             }
//         }
//         throw new IllegalArgumentException("DataSourceType.fromValue(" + value + ')');
//     }

//     /**
//      * Gets the underlying value of this type safe enumeration.
//      * This method is necessary to comply with DaoBase implementation.
//      * @return The name of this literal.
//      */
//     public String getValue()
//     {
//         return this.enumValue;
//     }
}
