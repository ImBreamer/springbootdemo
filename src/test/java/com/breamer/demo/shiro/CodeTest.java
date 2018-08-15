package com.breamer.demo.shiro;

import org.apache.shiro.crypto.hash.DefaultHashService;
import org.apache.shiro.crypto.hash.HashRequest;
import org.apache.shiro.crypto.hash.Sha1Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.Assert;
import org.junit.Test;

/**
 * shiro测试类-加密解密
 * @author breamer
 * @date 2018/7/16 09:50
 */
public class CodeTest {
    @Test
    public void encodeTest(){
        String password = "beyond1983ju";
        String salt = "breamer";
        String passwordBySha = new SimpleHash("SHA-1",password,salt,2).toString();
        System.out.println(1);
        String passwordBySha1 = new Sha1Hash(password,salt,2).toString();
        Assert.assertEquals(passwordBySha, passwordBySha1);
    }

    @Test
    public void encodeTestV2(){
        String password = "beyond1983ju";
        String salt = "breamer";
        String passwordBySha = new SimpleHash("SHA-1",password,salt,2).toString();
        System.out.println(1);
        String passwordBySha1 = new Sha1Hash(password,salt,2).toString();
        Assert.assertEquals(passwordBySha1, hashServiceTest("SHA-1",password,salt,2));
    }

    public String hashServiceTest(String algorithmName, String source, String salt, int iteration){
        DefaultHashService hashService = new DefaultHashService();
        HashRequest request = new HashRequest.Builder()
                .setAlgorithmName(algorithmName).setSalt(ByteSource.Util.bytes(salt)).setSource(ByteSource.Util.bytes(source)).setIterations(iteration)
                .build();
        return hashService.computeHash(request).toHex();
    }
}
