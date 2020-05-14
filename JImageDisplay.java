package ktp_lab4;
import java.awt.*;
import java.awt.image.BufferedImage;
// ����� JImageDisplay
public class JImageDisplay extends javax.swing.JComponent {
//����� ����� ���� ���� � ����� ������� private	
	private java.awt.image.BufferedImage image;
//�����������
	public JImageDisplay(int widht, int height) {
		image = new java.awt.image.BufferedImage(widht, height, BufferedImage.TYPE_INT_RGB);
	super.setPreferredSize(new Dimension(widht,height));
}
	//����������� ��� ��������� Swing 
	@Override
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
    }
	public void clearImage() {
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                image.setRGB(i, j, 0);
            }
        }
    }

    public void drawPixel(int x, int y, int rgbColor) {
        image.setRGB(x, y, rgbColor);
    }
}

