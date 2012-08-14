/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.data.commands.impl;

import org.eclipse.ecl.core.CorePackage;

import org.eclipse.ecl.data.commands.AssertTablesMatch;
import org.eclipse.ecl.data.commands.CommandsFactory;
import org.eclipse.ecl.data.commands.CommandsPackage;
import org.eclipse.ecl.data.commands.ExcludeColumns;
import org.eclipse.ecl.data.commands.IgnoreColumnsMode;
import org.eclipse.ecl.data.commands.Print;
import org.eclipse.ecl.data.commands.ReadCsvFile;
import org.eclipse.ecl.data.commands.ReadLines;
import org.eclipse.ecl.data.commands.SelectColumns;
import org.eclipse.ecl.data.commands.WriteCsvFile;

import org.eclipse.ecl.data.commands.WriteLines;
import org.eclipse.ecl.data.objects.ObjectsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandsPackageImpl extends EPackageImpl implements CommandsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readCsvFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeCsvFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludeColumnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectColumnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertTablesMatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeLinesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ignoreColumnsModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.ecl.data.commands.CommandsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommandsPackageImpl() {
		super(eNS_URI, CommandsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CommandsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommandsPackage init() {
		if (isInited) return (CommandsPackage)EPackage.Registry.INSTANCE.getEPackage(CommandsPackage.eNS_URI);

		// Obtain or create and register package
		CommandsPackageImpl theCommandsPackage = (CommandsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommandsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommandsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		ObjectsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommandsPackage.createPackageContents();

		// Initialize created meta-data
		theCommandsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommandsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommandsPackage.eNS_URI, theCommandsPackage);
		return theCommandsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadCsvFile() {
		return readCsvFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadCsvFile_Uri() {
		return (EAttribute)readCsvFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrint() {
		return printEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrint_Input() {
		return (EReference)printEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteCsvFile() {
		return writeCsvFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteCsvFile_Table() {
		return (EReference)writeCsvFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriteCsvFile_Uri() {
		return (EAttribute)writeCsvFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludeColumns() {
		return excludeColumnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExcludeColumns_Table() {
		return (EReference)excludeColumnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcludeColumns_Columns() {
		return (EAttribute)excludeColumnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectColumns() {
		return selectColumnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectColumns_Table() {
		return (EReference)selectColumnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectColumns_Columns() {
		return (EAttribute)selectColumnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertTablesMatch() {
		return assertTablesMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertTablesMatch_Left() {
		return (EReference)assertTablesMatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertTablesMatch_Right() {
		return (EReference)assertTablesMatchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertTablesMatch_IgnoreColumnOrder() {
		return (EAttribute)assertTablesMatchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertTablesMatch_IgnoreMissingColumns() {
		return (EAttribute)assertTablesMatchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteLines() {
		return writeLinesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriteLines_Uri() {
		return (EAttribute)writeLinesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriteLines_Append() {
		return (EAttribute)writeLinesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLines() {
		return readLinesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadLines_Uri() {
		return (EAttribute)readLinesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIgnoreColumnsMode() {
		return ignoreColumnsModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsFactory getCommandsFactory() {
		return (CommandsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		readCsvFileEClass = createEClass(READ_CSV_FILE);
		createEAttribute(readCsvFileEClass, READ_CSV_FILE__URI);

		printEClass = createEClass(PRINT);
		createEReference(printEClass, PRINT__INPUT);

		writeCsvFileEClass = createEClass(WRITE_CSV_FILE);
		createEReference(writeCsvFileEClass, WRITE_CSV_FILE__TABLE);
		createEAttribute(writeCsvFileEClass, WRITE_CSV_FILE__URI);

		excludeColumnsEClass = createEClass(EXCLUDE_COLUMNS);
		createEReference(excludeColumnsEClass, EXCLUDE_COLUMNS__TABLE);
		createEAttribute(excludeColumnsEClass, EXCLUDE_COLUMNS__COLUMNS);

		selectColumnsEClass = createEClass(SELECT_COLUMNS);
		createEReference(selectColumnsEClass, SELECT_COLUMNS__TABLE);
		createEAttribute(selectColumnsEClass, SELECT_COLUMNS__COLUMNS);

		assertTablesMatchEClass = createEClass(ASSERT_TABLES_MATCH);
		createEReference(assertTablesMatchEClass, ASSERT_TABLES_MATCH__LEFT);
		createEReference(assertTablesMatchEClass, ASSERT_TABLES_MATCH__RIGHT);
		createEAttribute(assertTablesMatchEClass, ASSERT_TABLES_MATCH__IGNORE_COLUMN_ORDER);
		createEAttribute(assertTablesMatchEClass, ASSERT_TABLES_MATCH__IGNORE_MISSING_COLUMNS);

		writeLinesEClass = createEClass(WRITE_LINES);
		createEAttribute(writeLinesEClass, WRITE_LINES__URI);
		createEAttribute(writeLinesEClass, WRITE_LINES__APPEND);

		readLinesEClass = createEClass(READ_LINES);
		createEAttribute(readLinesEClass, READ_LINES__URI);

		// Create enums
		ignoreColumnsModeEEnum = createEEnum(IGNORE_COLUMNS_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ObjectsPackage theObjectsPackage = (ObjectsPackage)EPackage.Registry.INSTANCE.getEPackage(ObjectsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		readCsvFileEClass.getESuperTypes().add(theCorePackage.getCommand());
		printEClass.getESuperTypes().add(theCorePackage.getCommand());
		writeCsvFileEClass.getESuperTypes().add(theCorePackage.getCommand());
		excludeColumnsEClass.getESuperTypes().add(theCorePackage.getCommand());
		selectColumnsEClass.getESuperTypes().add(theCorePackage.getCommand());
		assertTablesMatchEClass.getESuperTypes().add(theCorePackage.getCommand());
		writeLinesEClass.getESuperTypes().add(theCorePackage.getCommand());
		readLinesEClass.getESuperTypes().add(theCorePackage.getCommand());

		// Initialize classes and features; add operations and parameters
		initEClass(readCsvFileEClass, ReadCsvFile.class, "ReadCsvFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadCsvFile_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ReadCsvFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(printEClass, Print.class, "Print", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrint_Input(), theEcorePackage.getEObject(), null, "input", null, 0, -1, Print.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writeCsvFileEClass, WriteCsvFile.class, "WriteCsvFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteCsvFile_Table(), theObjectsPackage.getTable(), null, "table", null, 0, 1, WriteCsvFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWriteCsvFile_Uri(), theEcorePackage.getEString(), "uri", null, 0, 1, WriteCsvFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excludeColumnsEClass, ExcludeColumns.class, "ExcludeColumns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExcludeColumns_Table(), theObjectsPackage.getTable(), null, "table", null, 0, 1, ExcludeColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcludeColumns_Columns(), theEcorePackage.getEString(), "columns", null, 0, -1, ExcludeColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectColumnsEClass, SelectColumns.class, "SelectColumns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectColumns_Table(), theObjectsPackage.getTable(), null, "table", null, 0, 1, SelectColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectColumns_Columns(), theEcorePackage.getEString(), "columns", null, 0, -1, SelectColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertTablesMatchEClass, AssertTablesMatch.class, "AssertTablesMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertTablesMatch_Left(), theObjectsPackage.getTable(), null, "left", null, 0, 1, AssertTablesMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertTablesMatch_Right(), theObjectsPackage.getTable(), null, "right", null, 0, 1, AssertTablesMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertTablesMatch_IgnoreColumnOrder(), theEcorePackage.getEBoolean(), "ignoreColumnOrder", "false", 0, 1, AssertTablesMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertTablesMatch_IgnoreMissingColumns(), this.getIgnoreColumnsMode(), "ignoreMissingColumns", "NONE", 0, 1, AssertTablesMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writeLinesEClass, WriteLines.class, "WriteLines", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWriteLines_Uri(), theEcorePackage.getEString(), "uri", null, 0, 1, WriteLines.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWriteLines_Append(), theEcorePackage.getEBoolean(), "append", "false", 0, 1, WriteLines.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readLinesEClass, ReadLines.class, "ReadLines", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadLines_Uri(), theEcorePackage.getEString(), "uri", null, 0, 1, ReadLines.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ignoreColumnsModeEEnum, IgnoreColumnsMode.class, "IgnoreColumnsMode");
		addEEnumLiteral(ignoreColumnsModeEEnum, IgnoreColumnsMode.NONE);
		addEEnumLiteral(ignoreColumnsModeEEnum, IgnoreColumnsMode.LEFT);
		addEEnumLiteral(ignoreColumnsModeEEnum, IgnoreColumnsMode.RIGHT);
		addEEnumLiteral(ignoreColumnsModeEEnum, IgnoreColumnsMode.BOTH);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/ecl/docs
		createDocsAnnotations();
		// http://www.eclipse.org/ecl/input
		createInputAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/ecl/docs</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocsAnnotations() {
		String source = "http://www.eclipse.org/ecl/docs";		
		addAnnotation
		  (readCsvFileEClass, 
		   source, 
		   new String[] {
			 "description", "Parses given csv file. Fails if file is not found or format is invalid",
			 "returns", "<code>Table</code> EMF Object. "
		   });		
		addAnnotation
		  (getReadCsvFile_Uri(), 
		   source, 
		   new String[] {
			 "description", "URI to a file to read. Currently supported schemes are workspace:/ for files in workspace and file:/ for files on local file system"
		   });			
		addAnnotation
		  (writeCsvFileEClass, 
		   source, 
		   new String[] {
			 "description", "Writes given table into csv file. Fails if file is not accessible",
			 "returns", "The value of <code>table</code> argument."
		   });			
		addAnnotation
		  (getWriteCsvFile_Table(), 
		   source, 
		   new String[] {
			 "description", "Table to write"
		   });		
		addAnnotation
		  (getWriteCsvFile_Uri(), 
		   source, 
		   new String[] {
			 "description", "URI to write CSV data to. Currently supported schemes are workspace:/ for files in workspace and file:/ for files on local file system"
		   });		
		addAnnotation
		  (excludeColumnsEClass, 
		   source, 
		   new String[] {
			 "description", "Takes a table from input and returns the same table which has some columns excluded. ",
			 "returns", "Copy of input table object without columns with names listed in <code>columns</code>"
		   });			
		addAnnotation
		  (getExcludeColumns_Table(), 
		   source, 
		   new String[] {
			 "description", "Table to exclude columns from"
		   });		
		addAnnotation
		  (getExcludeColumns_Columns(), 
		   source, 
		   new String[] {
			 "description", "Column names to exclude from table. It is OK to pass column names which are not present in table"
		   });		
		addAnnotation
		  (selectColumnsEClass, 
		   source, 
		   new String[] {
			 "description", "Takes a table from input and returns the table containing only columns passed into <code>columns</code> argument.",
			 "returns", "Copy of input table object with only columns with names listed in <code>columns</code>"
		   });			
		addAnnotation
		  (getSelectColumns_Table(), 
		   source, 
		   new String[] {
			 "description", "Table to take columns from"
		   });		
		addAnnotation
		  (getSelectColumns_Columns(), 
		   source, 
		   new String[] {
			 "description", "Column names to take from table. If given column name is not present in input table, command fails"
		   });		
		addAnnotation
		  (assertTablesMatchEClass, 
		   source, 
		   new String[] {
			 "description", "Compares contents of two tables. If contents are not the same, fails with a descriptive message"
		   });		
		addAnnotation
		  (getAssertTablesMatch_IgnoreColumnOrder(), 
		   source, 
		   new String[] {
			 "description", "When true, column order is not taken into account"
		   });		
		addAnnotation
		  (getAssertTablesMatch_IgnoreMissingColumns(), 
		   source, 
		   new String[] {
			 "description", "Describes the comparison behaviour in case when one of tables contains a column which is not present in other table:\n<ul>\n<li><b>NONE</b> \u2013 all columns must be present in both tables</li>\n<li><b>LEFT</b> \u2013 columns from right table which are not present in left, are ignored</li>\n<li><b>RIGHT</b> \u2013 columns from left table which are not present in right, are ignored</li>\n<li><b>BOTH</b> \u2013 comparison performed only on columns present in both tables</li>\n<p>Another way to interpret this argument is that it is an answer on question &quot;Which column can have less columns?&quot;</p>\n<p>The primary reasoning for this argument is to provide smooth migration when presentation is changed \u2013 consider this scenario: we have a CSV file with table data, and we have UI table. If we add or remove extra columns in the UI, we can keep existing sample data file and just correct the <code>ignoreMissingColumns</code> argument</p>\n"
		   });		
		addAnnotation
		  (writeLinesEClass, 
		   source, 
		   new String[] {
			 "description", "Reads objects from input pipe and writes them into file line-by-line as strings"
		   });		
		addAnnotation
		  (getWriteLines_Uri(), 
		   source, 
		   new String[] {
			 "description", "URI to write lines to. Currently supported schemes are workspace:/ for files in workspace and file:/ for files on local file system"
		   });		
		addAnnotation
		  (getWriteLines_Append(), 
		   source, 
		   new String[] {
			 "description", "Whether to append given lines into file. Default value is false"
		   });		
		addAnnotation
		  (readLinesEClass, 
		   source, 
		   new String[] {
			 "description", "Reads lines from file identified by uri and writes them one-by-one into output pipe"
		   });		
		addAnnotation
		  (getReadLines_Uri(), 
		   source, 
		   new String[] {
			 "description", "URI to read lines from. Currently supported schemes are workspace:/ for files in workspace and file:/ for files on local file system"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/ecl/input</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createInputAnnotations() {
		String source = "http://www.eclipse.org/ecl/input";				
		addAnnotation
		  (getPrint_Input(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getWriteCsvFile_Table(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getExcludeColumns_Table(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getSelectColumns_Table(), 
		   source, 
		   new String[] {
		   });										
	}

} //CommandsPackageImpl