package commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ユーザ権限を表す列挙型
 *
 * @author takahiro-haraguchi
 */
@AllArgsConstructor
public enum UserAuthentication {
    ADMIN("admin"),
    GENERAL("general"),
    UNDEFINED("undefined");

    /** DBで保持される値*/
    @Getter
    private String dbValue;

    /**
     * <p>
     * 入力値を対応する列挙型に変換します。
     * 対応する値が存在しない場合は、UNDEFINEDを返す。
     * </p>
     *
     * @param val
     * @return UserAuthentication ユーザ権限の列挙型
     */
    public static UserAuthentication convertFrom(String val){
        for(UserAuthentication userAuth : UserAuthentication.values()){
            if(userAuth.getDbValue().equals(val)){
                return userAuth;
            }
        }
        return UserAuthentication.UNDEFINED;
    }
}