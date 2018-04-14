
package com.rodrigo.api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {
    /**
     * Gera um Hash utilizando o Bcript
     * @param senha
     * @return 
     */
    public static String gerarBcript (String senha) {
        if (senha == null) {
            return senha;
        } 
        
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.encode(senha);
    }
    
    /**
     * Verifica se a senha é verdadeira.
     * @param senha
     * @param senhaEncoded
     * @return 
     */
    public static Boolean senhaValida (String senha, String senhaEncoded) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return  bCryptPasswordEncoder.matches(senha, senhaEncoded);
    }
}
