//package com.example.Employee_Crud_Application.JWTConfig;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//import java.util.Date;
//
//public class JWTutil {
//    private static final String SECRET_KEY = "your-secret-key";
//
//    public static String generateToken(String email) {
//        return Jwts.builder()
//                .setSubject(email)
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour expiration
//                .signWith(SignatureAlgorithm.HS512, "mysecretkey12345")
//                .compact();
//    }
//
//    public static String extractEmail(String token) {
//        return Jwts.parser()
//                .setSigningKey(SECRET_KEY)
//                .parseClaimsJws(token)
//                .getBody()
//                .getSubject();
//    }
//
//    public static boolean isTokenExpired(String token) {
//        return extractExpirationDate(token).before(new Date());
//    }
//
//    private static Date extractExpirationDate(String token) {
//        return Jwts.parser()
//                .setSigningKey(SECRET_KEY)
//                .parseClaimsJws(token)
//                .getBody()
//                .getExpiration();
//    }
//}
