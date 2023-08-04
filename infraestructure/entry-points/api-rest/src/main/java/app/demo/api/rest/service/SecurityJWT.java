package app.demo.api.rest.service;

import bancolombia.poc.vd.security.model.JWTClaims;

public interface SecurityJWT {

    /**
     * @param privateKey
     * @param jwt
     * @return claims from jwt
     * @throws Exception
     */
    public JWTClaims validateJwToken(String jwt);

    /**
     * @param claims
     * @param numeroDocumento 
     * @param tipoDocumento 
     * @return
     * @throws Exception
     */
    public String generateJwToken(JWTClaims claims, String idSesion)throws Exception;

    /**
     * @param ventaDigital
     * @param jwt
     * @return idSesion from jwt
     */
    public String getIdSesion(String jwt) throws Exception;

    /**
     * @param path
     * @return publicKey from certificate file
     */
    public String getPublicKeyFile(String path);

    /**
     * @param path
     * @return privateKey from certificate file
     */
    public String getPrivateKey(String path);

    /**
     * 
     * @param idSesion
     * @param tokenApp
     * @param ipCliente
     * @param tipoDocumento
     * @param numeroDocumento
     * @return
     * @throws Exception
     */
	public String generateJwToken(String idSesion, String tokenApp, String ipCliente,
			String tipoDocumento, String numeroDocumento) throws Exception;

}