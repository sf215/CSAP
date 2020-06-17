package BasicGui;

import java.io.File;
import javax.swing.JPanel;
import javax.swing.*;

public class CommonReference {
		
	private static JTextPane currentCode;
	private static JTextPane fullCode;
	private static JTextPane warning;
	private static JTextPane status;
	private static JList<String> hierarchy;
	
	
	private static File file ; 
	private static JToolBar jToolBar;
	
	private static JButton create;
	private static JButton load;
	private static JButton run ;
	private static JButton undo;
	private static JButton close;
	private static JButton back;
	private static JButton compile;
	private static JButton help;

	private static JPanel panel0;
	private static JPanel panel1;
	private static JPanel panel2;
	private static JPanel panel3;
	
	
	private static String currentVersionCode = "";
	private static String fullVersionCode="";
	
	private static JScrollPane jScrollPanepanel2 ;
	private static JScrollPane jScrollPanepanel3;
	
	
	private static JButton panel2AllButton[] = new JButton[AllArrays.getPanel2Button().length];
	
	static void setScrollPanePanel2(JScrollPane pane2)
	{
		jScrollPanepanel2 = pane2;
	}
	static JScrollPane getScrollPanePanel2()
	{
		return jScrollPanepanel2;
	}
		
	static void setScrollPanePanel3(JScrollPane pane3)
	{
		jScrollPanepanel3 = pane3;
	}
	static JScrollPane getScrollPanePanel3()
	{
		return jScrollPanepanel3;
	}
	static void setPanel2AllButton(int i, JButton refernce)
	{
		panel2AllButton[i] = refernce;
	}
	static JButton getPanel2AllButton(int i)
	{
		return panel2AllButton[i];
	}
	
	
	static JPanel getPanel0() {
		return panel0;
	}
	static void setPanel0(JPanel panel0) {
		CommonReference.panel0 = panel0;
	}
	static JPanel getPanel1() {
		return panel1;
	}
	static void setPanel1(JPanel panel1) {
		CommonReference.panel1 = panel1;
	}
	static JPanel getPanel2() {
		return panel2;
	}
	static void setPanel2(JPanel panel2) {
		CommonReference.panel2 = panel2;
	}
	static JPanel getPanel3() {
		return panel3;
	}
	static void setPanel3(JPanel panel3) {
		CommonReference.panel3 = panel3;
	}	
	static JToolBar getJToolBar() {
		return jToolBar;
	}
	static void setJToolBar(JToolBar jToolBar) {
		CommonReference.jToolBar = jToolBar;
	}
	
	
	public static JButton getCreate() {
		return create;
	}
	public static void setCreate(JButton create) {
		CommonReference.create = create;
	}
	public static JButton getLoad() {
		return load;
	}
	public static void setLoad(JButton load) {
		CommonReference.load = load;
	}
	static JButton getRun() {
		return run;
	}
	static void setRun(JButton run) {
		CommonReference.run = run;
	}
	
	static JButton getUndo() {
		return undo;
	}
	static void setUndo(JButton undo) {
		CommonReference.undo = undo;
	}
	static JButton getClose() {
		return close;
	}
	static void setClose(JButton close) {
		CommonReference.close = close;
	}
	static JButton getBack() {
		return back;
	}
	static void setBack(JButton back) {
		CommonReference.back = back;
	}
	static JButton getCompile() {
		return compile;
	}
	static void setCompile(JButton console) {
		CommonReference.compile = console;
	}
	static JButton getHelp() {
		return help;
	}
	static void setHelp(JButton help) {
		CommonReference.help = help;
	}

	static void setCurrentCode(JTextPane currentCodes)
	{
		currentCode = currentCodes;
	}
	static JTextPane getCurrentCode()
	{
		return currentCode;
	}
	static void setFullCode(JTextPane fullcodes)
	{
		fullCode = fullcodes;
	}
	static JTextPane getFullCode()
	{
		return fullCode;
	}
	static void setWarning(JTextPane warning)
	{
		CommonReference.warning = warning;
	}
	static JTextPane getWarning()
	{
		return warning;
	}
	static void setStatus(JTextPane status)
	{
		CommonReference.status = status;
	}
	static JTextPane getstatus()
	{
		return status;
	}
	static void setHierarchy(JList<String> hierarchy)
	{
		CommonReference.hierarchy  = hierarchy;
	}
	static JList<String> getHierarchy()
	{
		return hierarchy;
	}
	
	static void setFile(File fi)
	{		
		file = fi;
	}
	static File getFile()
	{
		return file;
	}
	static void setFullVersionCode(String s )
	{
		fullVersionCode = s;
	}
	static String getFullVersionCode()
	{
		return fullVersionCode;
	}
	static void setCurrentVersionCode(String s )
	{
		currentVersionCode = s;
	}
	static String getCurrentVersionCode()
	{
		return currentVersionCode;
	}
	
	
	
}
