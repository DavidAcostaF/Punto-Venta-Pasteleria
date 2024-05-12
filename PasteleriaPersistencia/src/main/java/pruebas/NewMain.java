/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

/**
 *
 * @author abelc
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Valor base64 del campo contenido
        String base64Contenido = "JVBERi0xLjUKJeLjz9MKMyAwIG9iago8PC9GaWx0ZXIvRmxhdGVEZWNvZGUvTGVuZ3RoIDczMD4+c3RyZWFtCnicvZg9b9swEIZ3/Yob0yHMkUdK4lo0KZApTbUVHQRbcVPYceq47d8vKckRXdg8MjaCAJFpk3zJ5w5PPn4VH5uCSqixhGZeXDfFl0LBrX9XArov/73WCppVcXUjQSI0D8XFh+annztNQZitwkXSIlS2Emh3K5X2K7H/fLMoLu675/Vm28G8gz/d07Z98XsiLA7s++27e877c0n46ybdjvvcf379zMVJKQysClOZ8fWy+Lq/dm9XFGWFxgKKWsqq9M9+7A437AZGG7jUNWy64iG8nJWCoKyl0NPtei4okCRV8P/z4H0v79qXbbfsNo8tfPq9nHWw9e/PHtdPSShQVNqi8ueuFRk3Zzh5WRJIjXBJOJz8eJWMFBJKTcLK/QJPZbrpZj9af+jZevW8aRNPZo6USVrhquNPuCpkiUINA1+o44uGO/m5q/41Kb9JfM0YRGEQcUFu4pTUD6YoDvy4FvwzgbxC33ap7F1fbLrFyfBNQJ9UIv0YFD6Lwiy2ABSWmlRWASiv9anSQhNTgOuXbTtfn4idwqbXqU0fQ8FnUZjFYtdhiXVe3+td36NJMg46d1oGe7PetssTqeuw2U1p0qjHSPBZFGax1N3EKasfHKQu/U/Tndopub9LLWwNpYxxxvoKzZVCpc+j9TzbDveZtI7pWscwCJMMRqHBMAp6nJ+scvmuqN8k1hgCPgvDLBY3hYUlxeKmvMamyu1WMbjv2sX5xJ0n09j1+SwMs1jUOiyr5jtb7zo7TdbaWmEtg1oa91vumWSdJ9DY7fksDLNY0oOfQ1nHSfd1z5S1qd9T1nkOHe7zKmtTJcvaVEGQHySYCgNTBVFHZY25sn4v1G8SaAwBmzXgHrN43BQWlhSLm/Iae5R1HPdZZZ0n0Nj12awBtU7tbB2WVfOdrXednSXrOOpzyjpPoLHbs1kD6TGLJz34OZD1YdLH/zW0hxXB/bFSqqNIk3D+A/+w2ZAKZW5kc3RyZWFtCmVuZG9iagoxIDAgb2JqCjw8L1RhYnMvUy9Hcm91cDw8L1MvVHJhbnNwYXJlbmN5L1R5cGUvR3JvdXAvQ1MvRGV2aWNlUkdCPj4vQ29udGVudHMgMyAwIFIvVHlwZS9QYWdlL1Jlc291cmNlczw8L0NvbG9yU3BhY2U8PC9DUy9EZXZpY2VSR0I+Pi9Gb250PDwvRjEgMiAwIFI+Pj4+L1BhcmVudCA0IDAgUi9NZWRpYUJveFswIDAgNTk1IDg0Ml0+PgplbmRvYmoKNSAwIG9iagpbMSAwIFIvWFlaIDAgODUyIDBdCmVuZG9iagoyIDAgb2JqCjw8L1N1YnR5cGUvVHlwZTEvVHlwZS9Gb250L0Jhc2VGb250L0hlbHZldGljYS9FbmNvZGluZy9XaW5BbnNpRW5jb2Rpbmc+PgplbmRvYmoKNCAwIG9iago8PC9LaWRzWzEgMCBSXS9UeXBlL1BhZ2VzL0NvdW50IDE+PgplbmRvYmoKNiAwIG9iago8PC9OYW1lc1soSlJfUEFHRV9BTkNIT1JfMF8xKSA1IDAgUl0+PgplbmRvYmoKNyAwIG9iago8PC9EZXN0cyA2IDAgUj4+CmVuZG9iago4IDAgb2JqCjw8L05hbWVzIDcgMCBSL1R5cGUvQ2F0YWxvZy9QYWdlcyA0IDAgUi9WaWV3ZXJQcmVmZXJlbmNlczw8L1ByaW50U2NhbGluZy9BcHBEZWZhdWx0Pj4+PgplbmRvYmoKOSAwIG9iago8PC9DcmVhdG9yKEphc3BlclJlcG9ydHMgTGlicmFyeSB2ZXJzaW9uIDYuMjEuMi04NDM0YTBiZDdjM2JiYzM3Y2JmOTE2ZjI5NjhkMzVlNGIxNjU4MjFhKS9DcmVhdGlvbkRhdGUoRDoyMDI0MDUxMjEzMjAwNC0wNycwMCcpL1Byb2R1Y2VyKE9wZW5QREYgMS4zLjMyKT4+CmVuZG9iagp4cmVmCjAgMTAKMDAwMDAwMDAwMCA2NTUzNSBmIAowMDAwMDAwODEyIDAwMDAwIG4gCjAwMDAwMDEwNDMgMDAwMDAgbiAKMDAwMDAwMDAxNSAwMDAwMCBuIAowMDAwMDAxMTMxIDAwMDAwIG4gCjAwMDAwMDEwMDggMDAwMDAgbiAKMDAwMDAwMTE4MiAwMDAwMCBuIAowMDAwMDAxMjM2IDAwMDAwIG4gCjAwMDAwMDEyNjggMDAwMDAgbiAKMDAwMDAwMTM3MSAwMDAwMCBuIAp0cmFpbGVyCjw8L0luZm8gOSAwIFIvSUQgWzwwNjI5NWNiNjNkZmU4NjliZjk5YjRhZTY1ZjdlODBiMD48MDYyOTVjYjYzZGZlODY5YmY5OWI0YWU2NWY3ZTgwYjA+XS9Sb290IDggMCBSL1NpemUgMTA+PgpzdGFydHhyZWYKMTU0MQolJUVPRgo=";

        // Decodificar el valor base64 a bytes
        byte[] bytesContenido = Base64.getDecoder().decode(base64Contenido);

        // Crear un archivo temporal para almacenar el contenido PDF
        File tempFile;
        try {
            tempFile = File.createTempFile("temp", ".pdf");
            try (FileOutputStream fos = new FileOutputStream(tempFile)) {
                fos.write(bytesContenido);
            }

            // Abrir el archivo PDF en un visor PDF predeterminado
            Desktop.getDesktop().open(tempFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
