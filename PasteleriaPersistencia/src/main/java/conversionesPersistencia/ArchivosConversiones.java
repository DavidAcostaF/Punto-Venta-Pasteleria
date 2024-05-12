/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import java.io.File;
import java.io.IOException;
import org.bson.types.ObjectId;

/**
 *
 * @author PERSONAL
 */
public class ArchivosConversiones {

    
    //Clase pendiente de convertir
    public ArchivosConversiones() {
    }

    // Método para convertir de File a GridFS
    public ObjectId fileAGridFS(GridFS gridFS, String filename, File file) throws IOException {
        GridFSInputFile gfsFile = gridFS.createFile(file);
        gfsFile.setFilename(filename);
        gfsFile.save();
        return (ObjectId) gfsFile.getId();
    }

    // Método para convertir de GridFS a File
    public File gridFSToFile(GridFS gridFS, ObjectId id, String outputPath) throws IOException {
    GridFSDBFile gfsFile = gridFS.findOne(id);
    File file = null;
    if (gfsFile != null) {
        gfsFile.writeTo(outputPath);
        file = new File(outputPath);
    }
    return file;
}
}
