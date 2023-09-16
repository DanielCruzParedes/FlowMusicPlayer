package flow_labprogra2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author danie
 */
public class MusicPlayer {

    JFileChooser filechooser = new JFileChooser();
    ArrayList listaCanciones = new ArrayList();

    public MusicPlayer() {

    }

    ArrayList getListaCanciones() {
        return listaCanciones;
    }

    void add(JFrame frame) {
        //Para elegir varios archivos a la vez
        filechooser.setMultiSelectionEnabled(true);
        int respuestaFC = filechooser.showOpenDialog(frame);

        //Por si le dan cancel 
        if (respuestaFC == JFileChooser.CANCEL_OPTION) {
            return;
        } else if (respuestaFC == JFileChooser.APPROVE_OPTION) {
            File[] file = filechooser.getSelectedFiles();
            listaCanciones.addAll(Arrays.asList(file));
           
        }

    }

    

    FileInputStream fis;
    ObjectInputStream ois;
    public void abrirPlaylist(JFrame frame) {
        filechooser.setMultiSelectionEnabled(false);
        int Valid = filechooser.showOpenDialog(frame);

        if (Valid == JFileChooser.APPROVE_OPTION) {
            File pls = filechooser.getSelectedFile();

            try {
                fis = new FileInputStream(pls);
                ois = new ObjectInputStream(fis);
                File tmp;

                listaCanciones.clear();

                while ((tmp = (File) ois.readObject()) != null) {
                    listaCanciones.add(tmp);
                }

                ois.close();

            } catch (EOFException eof) {
                System.out.println("Fin del archivo.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    FileOutputStream fos;
    ObjectOutputStream oos;
    public void guardarPlaylist(JFrame frame) {
        filechooser.setMultiSelectionEnabled(false);
        int botonElegido = filechooser.showSaveDialog(frame);

        if (botonElegido == JFileChooser.CANCEL_OPTION) {
            return;
        } else if (botonElegido == JFileChooser.APPROVE_OPTION) {

            File nombreArchivo = filechooser.getSelectedFile();

            try {
                fos = new FileOutputStream(nombreArchivo + ".music");
                oos = new ObjectOutputStream(fos);

                for (int i = 0; i < listaCanciones.size(); i++) {
                    File tmp = (File) listaCanciones.get(i);
                    oos.writeObject(tmp);
                }
                oos.close();

            } catch (Exception e) {
                System.out.println("Algo salio mal guardando la playlist.");
            }

        }

    }
}
