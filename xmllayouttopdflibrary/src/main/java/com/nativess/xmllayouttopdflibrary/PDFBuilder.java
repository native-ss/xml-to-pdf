package com.nativess.xmllayouttopdflibrary;

import android.os.Environment;

public class PDFBuilder {

    //region Constants
    private static final String DIRECTORY_FOLDER_NAME = "/PDF/";
    private static final String DEFAULT_FILE_NAME = "pdf_file.pdf";
    private static final String DEFAULT_EMAIL = "email@email.com";
    private static final String DEFAULT_EMPTY = "";
    private static final int DEFAULT_PAGE_NUMBER = 1;
    private static final int DEFAULT_PAGE_WIDTH = 1300;
    private static final int DEFAULT_PAGE_HEIGHT = 1800;
    //endregion

    //region Field variables
    private int pdfPageWidth;
    private int pdfPageHeight;
    private final int pdfPageNumber;
    private String filename;
    private String directoryPath;
    private String email;
    private String emailSubject;
    private String emailText;
    //endregion

    //region Constructor
    public PDFBuilder() {
        directoryPath = Environment.getExternalStorageDirectory().toString() + "/"
                + Environment.DIRECTORY_DOCUMENTS + "/"
                + BuildConfig.LIBRARY_PACKAGE_NAME + DIRECTORY_FOLDER_NAME;
        pdfPageWidth = DEFAULT_PAGE_WIDTH;
        pdfPageHeight = DEFAULT_PAGE_HEIGHT;
        pdfPageNumber = DEFAULT_PAGE_NUMBER;
        filename = DEFAULT_FILE_NAME;
        email = DEFAULT_EMAIL;
        emailSubject = DEFAULT_EMPTY;
        emailText = DEFAULT_EMPTY;
    }
    //endregion

    //region Setters
    public PDFBuilder setPageWidth(final int pdfPageWidth) {
        this.pdfPageWidth = pdfPageWidth;
        return this;
    }

    public PDFBuilder setPageHeight(final int pdfPageHeight) {
        this.pdfPageHeight = pdfPageHeight;
        return this;
    }

    public PDFBuilder setPdfFileName(final String filename) {
        LogUtil.i("PDFBuilder: setPdfFileName: Appending .pdf to the fileName");
        this.filename = filename + ".pdf";
        return this;
    }

    public PDFBuilder setDirectoryPath(final String directoryPath) {
        LogUtil.i("PDFBuilder: setDirectoryPath: setting directory path");
        this.directoryPath = directoryPath;
        return this;
    }

    public PDFBuilder setEmail(final String email) {
        this.email = email;
        return this;
    }

    public PDFBuilder setEmailSubject(final String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }

    public PDFBuilder setEmailText(final String emailText) {
        this.emailText = emailText;
        return this;
    }
    //endregion

    //region Getters
    int getPdfPageWidth() {
        return pdfPageWidth;
    }

    int getPdfPageHeight() {
        return pdfPageHeight;
    }

    int getPdfPageNumber() {
        return pdfPageNumber;
    }

    String getFilename() {
        return filename;
    }

    String getDirectoryPath() {
        return directoryPath;
    }

    String getEmail() {
        return email;
    }

    String getEmailSubject() {
        return emailSubject;
    }

    String getEmailText() {
        return emailText;
    }
    //endregion
}

