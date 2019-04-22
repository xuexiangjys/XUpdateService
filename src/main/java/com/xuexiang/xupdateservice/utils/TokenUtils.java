package com.xuexiang.xupdateservice.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang3.StringUtils;

import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

/**
 * token生成工具
 * @author xuexiang
 * @since 2018/8/6 下午4:27
 */
public final class TokenUtils {

    /**
     * 签名秘钥
     */
    public static final String SECRET = "xuexiangjys";

    /**
     * 生成token
     *
     * @param id 一般传入userName
     * @return
     */
    public static String createJwtToken(String id) {
        String issuer = "www.github.com";
        String subject = "xuexiangjys@163.com";
        long ttlMillis = 60 * 60 * 1000; //有效期一小时
        return createJwtToken(id, issuer, subject, ttlMillis);
    }

    /**
     * 生成Token
     *
     * @param id        编号
     * @param issuer    该JWT的签发者，是否使用是可选的
     * @param subject   该JWT所面向的用户，是否使用是可选的；
     * @param ttlMillis 签发时间 （有效时间，过期会报错）
     * @return token String
     */
    public static String createJwtToken(String id, String issuer, String subject, long ttlMillis) {

        // 签名算法 ，将对token进行签名
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        // 生成签发时间
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        // 通过秘钥签名JWT
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SECRET);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        // Let's set the JWT Claims
        JwtBuilder builder = Jwts.builder().setId(id)
                .setIssuedAt(now)
                .setSubject(subject)
                .setIssuer(issuer)
                .signWith(signatureAlgorithm, signingKey);

        // if it has been specified, let's add the expiration
        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }

        // Builds the JWT and serializes it to a compact, URL-safe string
        return builder.compact();

    }

    // Sample method to validate and read the JWT
    public static Claims parseJWT(String jwt) {
        // This line will throw an exception if it is not a signed JWS (as expected)
        Claims claims = Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary(SECRET))
                .parseClaimsJws(jwt).getBody();
        return claims;
    }


    /**
     * 从HttpServletRequest中解析出token
     *
     * @param request
     * @return
     */
    public static String parseToken(HttpServletRequest request) {
        String accessToken = request.getHeader("X-Token");
        if (StringUtils.isEmpty(accessToken)) {
            accessToken = request.getParameter("token");
        }
        return accessToken;
    }

    public static void main(String[] args) {
        System.out.println(TokenUtils.createJwtToken("11111"));
    }

}
