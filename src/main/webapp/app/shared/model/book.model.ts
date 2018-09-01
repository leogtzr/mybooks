export interface IBook {
  id?: number;
  name?: string;
  author?: string;
  notes?: string;
  read?: boolean;
}

export const defaultValue: Readonly<IBook> = {
  read: false
};
