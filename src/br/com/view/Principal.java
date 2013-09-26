/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author ADM
 */
public class Principal extends JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        lbAvisoCores.setVisible(false);
        txtLogin.setText("Login");
        txtSenha.setText("Senha");
        pCor1.setVisible(false);
        pCor2.setVisible(false);
        pCor3.setVisible(false);
        pCor4.setVisible(false);
        pCor5.setVisible(false);
        pCor6.setVisible(false);
        pCor7.setVisible(false);
        pCor8.setVisible(false);
        pCor9.setVisible(false);
        pCor10.setVisible(false);
        pCor11.setVisible(false);
        pCor12.setVisible(false);
        pCor13.setVisible(false);
        pCor14.setVisible(false);
        pCor15.setVisible(false);
        pCor16.setVisible(false);
        pCor17.setVisible(false);
        pCor18.setVisible(false);
        pCor19.setVisible(false);
        pCor20.setVisible(false);


    }
    public void mouseEfeitoEntrar(int r, int g, int b){
        pCancelar.setBackground(new Color(r,g,b));
        pEntrar.setBackground(new Color(r,g,b));
    return;
    }
    public void cores(int botao) {

        if (botao == 1) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [164,196,0]
            r = 164;
            g = 196;
            b = 0;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 2) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [96,169,23]
            r = 96;
            g = 169;
            b = 23;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 3) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [0,138,0]
            r = 0;
            g = 138;
            b = 0;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 4) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal 
            r = 0;
            g = 171;
            b = 169;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 5) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [27,161,226]
            r = 27;
            g = 161;
            b = 226;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 6) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [0,80,239]
            r = 0;
            g = 80;
            b = 239;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 7) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [106,0,255]
            r = 106;
            g = 0;
            b = 255;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 8) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [170,0,255]
            r = 170;
            g = 0;
            b = 255;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 9) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [244,114,208]
            r = 244;
            g = 114;
            b = 208;
            //Car mais forte 
            ra = r ;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 10) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [216,0,115]
            r = 216;
            g = 0;
            b = 115;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 11) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [162,0,37]
            r = 162;
            g = 0;
            b = 37;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 12) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [229,20,0]
            r = 229;
            g = 20;
            b = 0;
            //Car mais forte 
            ra = r ;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 13) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [250,104,0]
            r = 250;
            g = 104;
            b = 0;
            //Car mais forte 
            ra = r;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 14) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [240,163,10]
            r = 240;
            g = 163;
            b = 10;
            //Car mais forte 
            ra = r;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 15) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [227,200,0]
            r = 227;
            g = 200;
            b = 0;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 16) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [130,90,44]
            r = 130;
            g = 90;
            b = 44;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 17) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [109,135,100]
            r = 109;
            g = 135;
            b = 100;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 18) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [100,118,135]
            r = 100;
            g = 118;
            b = 118;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 19) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [118,96,138]
            r = 118;
            g = 96;
            b = 138;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
        }else if (botao == 20) {
            //Variaveis
            int r, g, b, ra, ga, ba;
            //Cor normal [135,121,78]
            r = 135;
            g = 121;
            b = 78;
            //Car mais forte 
            ra = r + 20;
            ga = g + 20;
            ba = b + 20;

            pCentral.setBackground(new Color(r, g, b));
            pCancelar.setBackground(new Color(ra, ga, ba));
            pEntrar.setBackground(new Color(ra, ga, ba));
            pSuperior.setBackground(new Color(r, g, b));
            pInferior.setBackground(new Color(r, g, b));
            pLoginTop.setBackground(new Color(r, g, b));
            mouseEfeitoEntrar(r, g, b);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFundo = new javax.swing.JPanel();
        pSuperior = new javax.swing.JPanel();
        lbBemVindo = new javax.swing.JLabel();
        pInferior = new javax.swing.JPanel();
        btCores = new javax.swing.JButton();
        lbAvisoCores = new javax.swing.JLabel();
        pCor1 = new javax.swing.JPanel();
        pCor2 = new javax.swing.JPanel();
        pCor3 = new javax.swing.JPanel();
        pCor4 = new javax.swing.JPanel();
        pCor5 = new javax.swing.JPanel();
        pCor6 = new javax.swing.JPanel();
        pCor7 = new javax.swing.JPanel();
        pCor8 = new javax.swing.JPanel();
        pCor9 = new javax.swing.JPanel();
        pCor10 = new javax.swing.JPanel();
        pCor11 = new javax.swing.JPanel();
        pCor12 = new javax.swing.JPanel();
        pCor13 = new javax.swing.JPanel();
        pCor14 = new javax.swing.JPanel();
        pCor15 = new javax.swing.JPanel();
        pCor16 = new javax.swing.JPanel();
        pCor17 = new javax.swing.JPanel();
        pCor20 = new javax.swing.JPanel();
        pCor18 = new javax.swing.JPanel();
        pCor19 = new javax.swing.JPanel();
        pCentral = new javax.swing.JPanel();
        txtSenha = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        pCancelar = new javax.swing.JPanel();
        btCancelar = new javax.swing.JButton();
        pEntrar = new javax.swing.JPanel();
        btEntrar = new javax.swing.JButton();
        pLoginTop = new javax.swing.JPanel();
        lbLoginTop = new javax.swing.JLabel();
        lbImagen = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pFundo.setBackground(new java.awt.Color(255, 255, 255));
        pFundo.setLayout(null);

        pSuperior.setBackground(new java.awt.Color(217, 131, 208));
        pSuperior.setLayout(null);

        lbBemVindo.setFont(new java.awt.Font("Segoe WP", 0, 36)); // NOI18N
        lbBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lbBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBemVindo.setText("Bem Vindo");
        pSuperior.add(lbBemVindo);
        lbBemVindo.setBounds(0, -10, 420, 90);

        pFundo.add(pSuperior);
        pSuperior.setBounds(0, 10, 1080, 60);

        pInferior.setBackground(new java.awt.Color(217, 131, 208));
        pInferior.setLayout(null);

        btCores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/TabelaDeCores.fw.png"))); // NOI18N
        btCores.setContentAreaFilled(false);
        btCores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCoresMouseExited(evt);
            }
        });
        pInferior.add(btCores);
        btCores.setBounds(10, 10, 70, 60);

        lbAvisoCores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbAvisoCores.setForeground(new java.awt.Color(255, 255, 255));
        lbAvisoCores.setText("Alterar cor do sistema");
        pInferior.add(lbAvisoCores);
        lbAvisoCores.setBounds(90, 60, 140, 20);

        pCor1.setBackground(new java.awt.Color(164, 196, 0));
        pCor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor1Layout = new javax.swing.GroupLayout(pCor1);
        pCor1.setLayout(pCor1Layout);
        pCor1Layout.setHorizontalGroup(
            pCor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor1Layout.setVerticalGroup(
            pCor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor1);
        pCor1.setBounds(230, 10, 40, 30);

        pCor2.setBackground(new java.awt.Color(96, 169, 23));
        pCor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor2Layout = new javax.swing.GroupLayout(pCor2);
        pCor2.setLayout(pCor2Layout);
        pCor2Layout.setHorizontalGroup(
            pCor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor2Layout.setVerticalGroup(
            pCor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor2);
        pCor2.setBounds(280, 10, 40, 30);

        pCor3.setBackground(new java.awt.Color(0, 138, 0));
        pCor3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor3Layout = new javax.swing.GroupLayout(pCor3);
        pCor3.setLayout(pCor3Layout);
        pCor3Layout.setHorizontalGroup(
            pCor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor3Layout.setVerticalGroup(
            pCor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor3);
        pCor3.setBounds(330, 10, 40, 30);

        pCor4.setBackground(new java.awt.Color(0, 171, 169));
        pCor4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor4Layout = new javax.swing.GroupLayout(pCor4);
        pCor4.setLayout(pCor4Layout);
        pCor4Layout.setHorizontalGroup(
            pCor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor4Layout.setVerticalGroup(
            pCor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor4);
        pCor4.setBounds(380, 10, 40, 30);

        pCor5.setBackground(new java.awt.Color(27, 161, 226));
        pCor5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor5Layout = new javax.swing.GroupLayout(pCor5);
        pCor5.setLayout(pCor5Layout);
        pCor5Layout.setHorizontalGroup(
            pCor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor5Layout.setVerticalGroup(
            pCor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor5);
        pCor5.setBounds(430, 10, 40, 30);

        pCor6.setBackground(new java.awt.Color(0, 80, 239));
        pCor6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor6Layout = new javax.swing.GroupLayout(pCor6);
        pCor6.setLayout(pCor6Layout);
        pCor6Layout.setHorizontalGroup(
            pCor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor6Layout.setVerticalGroup(
            pCor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor6);
        pCor6.setBounds(480, 10, 40, 30);

        pCor7.setBackground(new java.awt.Color(106, 0, 255));
        pCor7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor7Layout = new javax.swing.GroupLayout(pCor7);
        pCor7.setLayout(pCor7Layout);
        pCor7Layout.setHorizontalGroup(
            pCor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor7Layout.setVerticalGroup(
            pCor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor7);
        pCor7.setBounds(530, 10, 40, 30);

        pCor8.setBackground(new java.awt.Color(170, 0, 255));
        pCor8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor8Layout = new javax.swing.GroupLayout(pCor8);
        pCor8.setLayout(pCor8Layout);
        pCor8Layout.setHorizontalGroup(
            pCor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor8Layout.setVerticalGroup(
            pCor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor8);
        pCor8.setBounds(580, 10, 40, 30);

        pCor9.setBackground(new java.awt.Color(244, 114, 208));
        pCor9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor9Layout = new javax.swing.GroupLayout(pCor9);
        pCor9.setLayout(pCor9Layout);
        pCor9Layout.setHorizontalGroup(
            pCor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor9Layout.setVerticalGroup(
            pCor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor9);
        pCor9.setBounds(630, 10, 40, 30);

        pCor10.setBackground(new java.awt.Color(216, 0, 115));
        pCor10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor10Layout = new javax.swing.GroupLayout(pCor10);
        pCor10.setLayout(pCor10Layout);
        pCor10Layout.setHorizontalGroup(
            pCor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor10Layout.setVerticalGroup(
            pCor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor10);
        pCor10.setBounds(680, 10, 40, 30);

        pCor11.setBackground(new java.awt.Color(162, 0, 37));
        pCor11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor11Layout = new javax.swing.GroupLayout(pCor11);
        pCor11.setLayout(pCor11Layout);
        pCor11Layout.setHorizontalGroup(
            pCor11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor11Layout.setVerticalGroup(
            pCor11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor11);
        pCor11.setBounds(730, 10, 40, 30);

        pCor12.setBackground(new java.awt.Color(229, 20, 0));
        pCor12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor12Layout = new javax.swing.GroupLayout(pCor12);
        pCor12.setLayout(pCor12Layout);
        pCor12Layout.setHorizontalGroup(
            pCor12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor12Layout.setVerticalGroup(
            pCor12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor12);
        pCor12.setBounds(780, 10, 40, 30);

        pCor13.setBackground(new java.awt.Color(250, 104, 0));
        pCor13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor13Layout = new javax.swing.GroupLayout(pCor13);
        pCor13.setLayout(pCor13Layout);
        pCor13Layout.setHorizontalGroup(
            pCor13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor13Layout.setVerticalGroup(
            pCor13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor13);
        pCor13.setBounds(830, 10, 40, 30);

        pCor14.setBackground(new java.awt.Color(240, 163, 10));
        pCor14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor14Layout = new javax.swing.GroupLayout(pCor14);
        pCor14.setLayout(pCor14Layout);
        pCor14Layout.setHorizontalGroup(
            pCor14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor14Layout.setVerticalGroup(
            pCor14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor14);
        pCor14.setBounds(880, 10, 40, 30);

        pCor15.setBackground(new java.awt.Color(227, 200, 0));
        pCor15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor15Layout = new javax.swing.GroupLayout(pCor15);
        pCor15.setLayout(pCor15Layout);
        pCor15Layout.setHorizontalGroup(
            pCor15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor15Layout.setVerticalGroup(
            pCor15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor15);
        pCor15.setBounds(930, 10, 40, 30);

        pCor16.setBackground(new java.awt.Color(130, 90, 44));
        pCor16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor16Layout = new javax.swing.GroupLayout(pCor16);
        pCor16.setLayout(pCor16Layout);
        pCor16Layout.setHorizontalGroup(
            pCor16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor16Layout.setVerticalGroup(
            pCor16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor16);
        pCor16.setBounds(980, 10, 40, 30);

        pCor17.setBackground(new java.awt.Color(109, 135, 100));
        pCor17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor17Layout = new javax.swing.GroupLayout(pCor17);
        pCor17.setLayout(pCor17Layout);
        pCor17Layout.setHorizontalGroup(
            pCor17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor17Layout.setVerticalGroup(
            pCor17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor17);
        pCor17.setBounds(1030, 10, 40, 30);

        pCor20.setBackground(new java.awt.Color(135, 121, 78));
        pCor20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor20Layout = new javax.swing.GroupLayout(pCor20);
        pCor20.setLayout(pCor20Layout);
        pCor20Layout.setHorizontalGroup(
            pCor20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor20Layout.setVerticalGroup(
            pCor20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor20);
        pCor20.setBounds(330, 50, 40, 30);

        pCor18.setBackground(new java.awt.Color(100, 118, 135));
        pCor18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor18Layout = new javax.swing.GroupLayout(pCor18);
        pCor18.setLayout(pCor18Layout);
        pCor18Layout.setHorizontalGroup(
            pCor18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor18Layout.setVerticalGroup(
            pCor18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor18);
        pCor18.setBounds(230, 50, 40, 30);

        pCor19.setBackground(new java.awt.Color(118, 96, 138));
        pCor19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCor19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pCor19Layout = new javax.swing.GroupLayout(pCor19);
        pCor19.setLayout(pCor19Layout);
        pCor19Layout.setHorizontalGroup(
            pCor19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        pCor19Layout.setVerticalGroup(
            pCor19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pInferior.add(pCor19);
        pCor19.setBounds(280, 50, 40, 30);

        pFundo.add(pInferior);
        pInferior.setBounds(0, 580, 1080, 90);

        pCentral.setBackground(new java.awt.Color(217, 131, 208));
        pCentral.setLayout(null);

        txtSenha.setFont(new java.awt.Font("Segoe WP", 0, 14)); // NOI18N
        pCentral.add(txtSenha);
        txtSenha.setBounds(40, 160, 490, 32);

        txtLogin.setFont(new java.awt.Font("Segoe WP", 0, 14)); // NOI18N
        pCentral.add(txtLogin);
        txtLogin.setBounds(40, 80, 490, 32);

        pCancelar.setBackground(new java.awt.Color(142, 68, 173));
        pCancelar.setLayout(null);

        btCancelar.setFont(new java.awt.Font("Segoe WP", 0, 18)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("Cancelar");
        btCancelar.setContentAreaFilled(false);
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCancelarMouseExited(evt);
            }
        });
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        pCancelar.add(btCancelar);
        btCancelar.setBounds(0, 0, 120, 50);

        pCentral.add(pCancelar);
        pCancelar.setBounds(290, 240, 120, 50);

        pEntrar.setBackground(new java.awt.Color(142, 68, 173));
        pEntrar.setLayout(null);

        btEntrar.setFont(new java.awt.Font("Segoe WP", 0, 18)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btEntrar.setText("Entrar");
        btEntrar.setContentAreaFilled(false);
        btEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btEntrarMouseExited(evt);
            }
        });
        pEntrar.add(btEntrar);
        btEntrar.setBounds(0, 0, 100, 50);

        pCentral.add(pEntrar);
        pEntrar.setBounds(430, 240, 100, 50);

        pFundo.add(pCentral);
        pCentral.setBounds(420, 170, 570, 310);

        pLoginTop.setBackground(new java.awt.Color(217, 131, 208));
        pLoginTop.setLayout(null);

        lbLoginTop.setBackground(new java.awt.Color(142, 68, 173));
        lbLoginTop.setFont(new java.awt.Font("Segoe WP", 0, 24)); // NOI18N
        lbLoginTop.setForeground(new java.awt.Color(255, 255, 255));
        lbLoginTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLoginTop.setText("Login");
        pLoginTop.add(lbLoginTop);
        lbLoginTop.setBounds(0, 0, 110, 60);

        pFundo.add(pLoginTop);
        pLoginTop.setBounds(420, 110, 110, 80);

        lbImagen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/Rosto.fw_1.png"))); // NOI18N
        pFundo.add(lbImagen);
        lbImagen.setBounds(-10, 90, 540, 490);

        jMenuBar1.setBackground(new java.awt.Color(217, 131, 208));

        jMenu1.setBackground(new java.awt.Color(217, 131, 208));
        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(217, 131, 208));
        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(217, 131, 208));
        jMenu3.setText("jMenu3");
        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(217, 131, 208));
        jMenu4.setText("jMenu4");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseEntered
        pCancelar.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btCancelarMouseEntered
    private void btCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseExited
        pCancelar.setBackground(new Color(142, 68, 173));
    }//GEN-LAST:event_btCancelarMouseExited

    private void btEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarMouseEntered
        pEntrar.setBackground(new Color(155, 89, 182));
    }//GEN-LAST:event_btEntrarMouseEntered

    private void btEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarMouseExited
        pEntrar.setBackground(new Color(142, 68, 173));
    }//GEN-LAST:event_btEntrarMouseExited

    private void btCoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCoresMouseEntered
        lbAvisoCores.setVisible(true);
    }//GEN-LAST:event_btCoresMouseEntered

    private void btCoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCoresMouseExited
        lbAvisoCores.setVisible(false);
    }//GEN-LAST:event_btCoresMouseExited

    private void btCoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCoresMouseClicked
        if (!pCor1.isVisible()) {
            pCor1.setVisible(true);
            pCor2.setVisible(true);
            pCor3.setVisible(true);
            pCor4.setVisible(true);
            pCor5.setVisible(true);
            pCor6.setVisible(true);
            pCor7.setVisible(true);
            pCor8.setVisible(true);
            pCor9.setVisible(true);
            pCor10.setVisible(true);
            pCor11.setVisible(true);
            pCor12.setVisible(true);
            pCor13.setVisible(true);
            pCor14.setVisible(true);
            pCor15.setVisible(true);
            pCor16.setVisible(true);
            pCor17.setVisible(true);
            pCor18.setVisible(true);
            pCor19.setVisible(true);
            pCor20.setVisible(true);
        } else {
            pCor1.setVisible(false);
            pCor2.setVisible(false);
            pCor3.setVisible(false);
            pCor4.setVisible(false);
            pCor5.setVisible(false);
            pCor6.setVisible(false);
            pCor7.setVisible(false);
            pCor8.setVisible(false);
            pCor9.setVisible(false);
            pCor10.setVisible(false);
            pCor11.setVisible(false);
            pCor12.setVisible(false);
            pCor13.setVisible(false);
            pCor14.setVisible(false);
            pCor15.setVisible(false);
            pCor16.setVisible(false);
            pCor17.setVisible(false);
            pCor18.setVisible(false);
            pCor19.setVisible(false);
            pCor20.setVisible(false);

        }
    }//GEN-LAST:event_btCoresMouseClicked

    private void pCor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor1MouseClicked
        int botao = 1;
        cores(botao);
    }//GEN-LAST:event_pCor1MouseClicked

    private void pCor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor2MouseClicked
        int botao = 2;
        cores(botao);
    }//GEN-LAST:event_pCor2MouseClicked

    private void pCor3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor3MouseClicked
        int botao = 3;
        cores(botao);
    }//GEN-LAST:event_pCor3MouseClicked

    private void pCor4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor4MouseClicked
        int botao = 4;
        cores(botao);
    }//GEN-LAST:event_pCor4MouseClicked

    private void pCor5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor5MouseClicked
        int botao = 5;
        cores(botao);
    }//GEN-LAST:event_pCor5MouseClicked

    private void pCor6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor6MouseClicked
        int botao = 6;
        cores(botao);
    }//GEN-LAST:event_pCor6MouseClicked

    private void pCor7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor7MouseClicked
        int botao = 7;
        cores(botao);
    }//GEN-LAST:event_pCor7MouseClicked

    private void pCor8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor8MouseClicked
        int botao = 8;
        cores(botao);
    }//GEN-LAST:event_pCor8MouseClicked

    private void pCor9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor9MouseClicked
        int botao = 9;
        cores(botao);
    }//GEN-LAST:event_pCor9MouseClicked

    private void pCor10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor10MouseClicked
        int botao = 10;
        cores(botao);
    }//GEN-LAST:event_pCor10MouseClicked

    private void pCor11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor11MouseClicked
        int botao = 11;
        cores(botao);
    }//GEN-LAST:event_pCor11MouseClicked

    private void pCor12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor12MouseClicked
        int botao = 12;
        cores(botao);
    }//GEN-LAST:event_pCor12MouseClicked

    private void pCor13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor13MouseClicked
        int botao = 13;
        cores(botao);
    }//GEN-LAST:event_pCor13MouseClicked

    private void pCor14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor14MouseClicked
        int botao = 14;
        cores(botao);
    }//GEN-LAST:event_pCor14MouseClicked

    private void pCor15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor15MouseClicked
        int botao = 15;
        cores(botao);
    }//GEN-LAST:event_pCor15MouseClicked

    private void pCor16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor16MouseClicked
        int botao = 16;
        cores(botao);
    }//GEN-LAST:event_pCor16MouseClicked

    private void pCor17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor17MouseClicked
        int botao = 17;
        cores(botao);
    }//GEN-LAST:event_pCor17MouseClicked

    private void pCor18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor18MouseClicked
        int botao = 18;
        cores(botao);
    }//GEN-LAST:event_pCor18MouseClicked

    private void pCor19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor19MouseClicked
        int botao = 19;
        cores(botao);
    }//GEN-LAST:event_pCor19MouseClicked

    private void pCor20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCor20MouseClicked
        int botao = 20;
        cores(botao);
    }//GEN-LAST:event_pCor20MouseClicked

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCores;
    private javax.swing.JButton btEntrar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbAvisoCores;
    private javax.swing.JLabel lbBemVindo;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbLoginTop;
    private javax.swing.JPanel pCancelar;
    private javax.swing.JPanel pCentral;
    private javax.swing.JPanel pCor1;
    private javax.swing.JPanel pCor10;
    private javax.swing.JPanel pCor11;
    private javax.swing.JPanel pCor12;
    private javax.swing.JPanel pCor13;
    private javax.swing.JPanel pCor14;
    private javax.swing.JPanel pCor15;
    private javax.swing.JPanel pCor16;
    private javax.swing.JPanel pCor17;
    private javax.swing.JPanel pCor18;
    private javax.swing.JPanel pCor19;
    private javax.swing.JPanel pCor2;
    private javax.swing.JPanel pCor20;
    private javax.swing.JPanel pCor3;
    private javax.swing.JPanel pCor4;
    private javax.swing.JPanel pCor5;
    private javax.swing.JPanel pCor6;
    private javax.swing.JPanel pCor7;
    private javax.swing.JPanel pCor8;
    private javax.swing.JPanel pCor9;
    private javax.swing.JPanel pEntrar;
    private javax.swing.JPanel pFundo;
    private javax.swing.JPanel pInferior;
    private javax.swing.JPanel pLoginTop;
    private javax.swing.JPanel pSuperior;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
