package flow_labprogra2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author danie
 */
public class FlowVisual extends javax.swing.JFrame {

    MusicPlayer musicplayer = new MusicPlayer();
    ArrayList listaCanciones = new ArrayList();
    
    //Instanciar la libreria externa del mediaplayer
    javazoom.jl.player.Player mediaplayer;

    public FlowVisual() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPlaylist = new javax.swing.JList<>();
        btnPlaySong = new javax.swing.JButton();
        btnNextSong = new javax.swing.JButton();
        btnPreviousSong = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblCancion = new javax.swing.JLabel();
        btnAgregarCancion = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnGuardarPlaylist = new javax.swing.JButton();
        btnAbrirPlaylist = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        listPlaylist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "No hay ninguna cancion agregada" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listPlaylist);

        btnPlaySong.setBackground(new java.awt.Color(0, 204, 51));
        btnPlaySong.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        btnPlaySong.setForeground(new java.awt.Color(0, 0, 0));
        btnPlaySong.setText("Play");
        btnPlaySong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaySongActionPerformed(evt);
            }
        });

        btnNextSong.setBackground(new java.awt.Color(0, 204, 51));
        btnNextSong.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        btnNextSong.setForeground(new java.awt.Color(0, 0, 0));
        btnNextSong.setText(">>");
        btnNextSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextSongActionPerformed(evt);
            }
        });

        btnPreviousSong.setBackground(new java.awt.Color(0, 204, 51));
        btnPreviousSong.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        btnPreviousSong.setForeground(new java.awt.Color(0, 0, 0));
        btnPreviousSong.setText("<<");
        btnPreviousSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousSongActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Now Playing:");

        lblCancion.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        lblCancion.setForeground(new java.awt.Color(255, 255, 255));
        lblCancion.setText("Nombre Cancion");

        btnAgregarCancion.setBackground(new java.awt.Color(0, 204, 51));
        btnAgregarCancion.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        btnAgregarCancion.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarCancion.setText("Add Song");
        btnAgregarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCancionActionPerformed(evt);
            }
        });

        btnStop.setBackground(new java.awt.Color(0, 204, 51));
        btnStop.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        btnStop.setForeground(new java.awt.Color(0, 0, 0));
        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Spotify Premium Pro Max");

        btnGuardarPlaylist.setBackground(new java.awt.Color(0, 204, 51));
        btnGuardarPlaylist.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        btnGuardarPlaylist.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarPlaylist.setText("Guardar Playlist");
        btnGuardarPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPlaylistActionPerformed(evt);
            }
        });

        btnAbrirPlaylist.setBackground(new java.awt.Color(0, 204, 51));
        btnAbrirPlaylist.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        btnAbrirPlaylist.setForeground(new java.awt.Color(0, 0, 0));
        btnAbrirPlaylist.setText("Abrir Playlist");
        btnAbrirPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirPlaylistActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 204, 51));
        btnDelete.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(178, 178, 178))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPreviousSong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlaySong)
                        .addGap(78, 78, 78)
                        .addComponent(btnNextSong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStop))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCancion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnAgregarCancion)
                        .addGap(161, 161, 161)
                        .addComponent(btnGuardarPlaylist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrirPlaylist)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCancion)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlaySong, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextSong, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPreviousSong, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCancionActionPerformed
        agregarCancion();
    }//GEN-LAST:event_btnAgregarCancionActionPerformed

    private void btnPlaySongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaySongActionPerformed
        play();

    }//GEN-LAST:event_btnPlaySongActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        mediaplayer.close();
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnPreviousSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousSongActionPerformed
        anteriorCancion();

    }//GEN-LAST:event_btnPreviousSongActionPerformed

    private void btnNextSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSongActionPerformed
        siguienteCancion();
    }//GEN-LAST:event_btnNextSongActionPerformed

    private void btnGuardarPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPlaylistActionPerformed
        guardarPlaylist();
    }//GEN-LAST:event_btnGuardarPlaylistActionPerformed

    private void btnAbrirPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirPlaylistActionPerformed
        abrirPlaylist();
    }//GEN-LAST:event_btnAbrirPlaylistActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        quitarCancion();
    }//GEN-LAST:event_btnDeleteActionPerformed

    File cancionATocar;

    //0 es cuando nada se esta tocando, 1 cuando se esta tocando
    static int estadoCancion = 0;
    int cancionSeleccionada=0;
    private void play() {
        if (estadoCancion == 0) {
            try {
                cancionSeleccionada = listPlaylist.getSelectedIndex();
                cancionATocar = (File) this.listaCanciones.get(cancionSeleccionada);
                FileInputStream fis = new FileInputStream(cancionATocar);
                BufferedInputStream bis = new BufferedInputStream(fis);
                mediaplayer = new javazoom.jl.player.Player(bis);
                estadoCancion = 1;

            } catch (Exception e) {
                System.out.println("Problema al tocar audio");
                System.out.println(e);
            }

            new Thread() {
                @Override
                public void run() {

                    try {
                        mediaplayer.play();
                        lblCancion.setText(listaCanciones.get(cancionSeleccionada).toString());
                    } catch (Exception e) {

                    }
                }

            }.start();

        } else {
            mediaplayer.close();
            estadoCancion = 0;
            //Llama a play para que comience el audio
            play();

        }

    }
    
     void quitarCancion() {

        try {
            int cancionElegida = listPlaylist.getLeadSelectionIndex();
            musicplayer.filechooser.remove(cancionElegida);
            actualizarLista();

        } catch (Exception e) {
        }

    }
    
    void abrirPlaylist() {
        musicplayer.abrirPlaylist(this);
        actualizarLista();
    }

     void siguienteCancion() {

        if (estadoCancion == 0) {
            try {
                int cancionSeleccionada = listPlaylist.getSelectedIndex() + 1;
                cancionATocar = (File) this.musicplayer.listaCanciones.get(cancionSeleccionada);
                FileInputStream fis = new FileInputStream(cancionATocar);
                BufferedInputStream bis = new BufferedInputStream(fis);
                mediaplayer = new javazoom.jl.player.Player(bis);
                estadoCancion = 1;
                listPlaylist.setSelectedIndex(cancionSeleccionada);

            } catch (Exception e) {
                System.out.println("Problema al tocar el audio");
                System.out.println(e);
            }

            new Thread() {
                @Override
                public void run() {

                    try {
                        mediaplayer.play();

                    } catch (Exception e) {
                        System.out.println("Algo salio mal");
                    }
                }

            }.start();

        } else {
            mediaplayer.close();
            estadoCancion = 0;
            siguienteCancion();

        }

    }

    void anteriorCancion() {

        if (estadoCancion == 0) {
            try {
                int cancionSeleccionada = listPlaylist.getSelectedIndex() - 1;
                cancionATocar = (File) this.musicplayer.listaCanciones.get(cancionSeleccionada);
                FileInputStream fis = new FileInputStream(cancionATocar);
                BufferedInputStream bis = new BufferedInputStream(fis);
                mediaplayer = new javazoom.jl.player.Player(bis);
                estadoCancion = 1;
                listPlaylist.setSelectedIndex(cancionSeleccionada);

            } catch (Exception e) {
                System.out.println("Problema al tocar musica");
                System.out.println(e);
            }

            new Thread() {
                @Override
                public void run() {

                    try {
                        mediaplayer.play();

                    } catch (Exception e) {

                    }
                }

            }.start();

        } else {
            mediaplayer.close();
            estadoCancion = 0;
            anteriorCancion();

        }

    }

    public void actualizarLista() {

        listaCanciones = musicplayer.getListaCanciones();
        DefaultListModel model = new DefaultListModel();
        int j=0;
        for (int i = 0; i < listaCanciones.size(); i++) {
            j = j + 1;
            model.add(i, j + " | " + ((File) listaCanciones.get(i)).getName());

        }
        listPlaylist.setModel(model);

    }

    private void agregarCancion() {
        musicplayer.add(this);
        actualizarLista();
    }

    private void guardarPlaylist() {
        musicplayer.guardarPlaylist(this);
        actualizarLista();
    }
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FlowVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlowVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlowVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlowVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlowVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirPlaylist;
    private javax.swing.JButton btnAgregarCancion;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGuardarPlaylist;
    private javax.swing.JButton btnNextSong;
    private javax.swing.JButton btnPlaySong;
    private javax.swing.JButton btnPreviousSong;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCancion;
    private javax.swing.JList<String> listPlaylist;
    // End of variables declaration//GEN-END:variables
}
